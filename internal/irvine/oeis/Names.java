package irvine.oeis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.zip.GZIPInputStream;

import irvine.util.io.IOUtils;

/**
 * Check and update if necessary the name field in the comments of each sequence implementation.
 * Includes some smarts to try and wrap pieces that look like formulas in code tags.
 * @author Sean A. Irvine
 */
public final class Names {

  private static final int A_NUMBER_LENGTH = 6;

  private Names() { }

  private static final char[] SPECIAL = "0123456789^*/%(){}[]<>!=+#|_-".toCharArray();
  private static final Set<String> FORMULA = new HashSet<>();
  static {
    FORMULA.add("&lt;");
    FORMULA.add("&gt;");
    FORMULA.add("mod");
    FORMULA.add("sqrt");
    FORMULA.add("gdinv");
    FORMULA.add("dsf");
    FORMULA.add("dsf.");
    FORMULA.add("elif");
    FORMULA.add("sopfr");
    FORMULA.add("mmdd");
    FORMULA.add("INVERTi");
    FORMULA.add("\\atop");
    FORMULA.add("Pi");
    FORMULA.add("(Pi)");
    FORMULA.add("(Pi).");
    FORMULA.add("(Pi");
    FORMULA.add("Pi)");
    FORMULA.add("n");
    FORMULA.add("x");
    FORMULA.add("y");
    FORMULA.add("z");
    FORMULA.add("ij");
    FORMULA.add("xy");
    FORMULA.add("XY");
    FORMULA.add("xj");
    FORMULA.add("xk");
    FORMULA.add("xn");
    FORMULA.add("xn.");
    FORMULA.add("uu.");
    FORMULA.add("PSumSIGN");
    FORMULA.add("Zp");
    FORMULA.add("xRy");
    FORMULA.add("VVV..VV");
    FORMULA.add("abacabaabacababac...");
    FORMULA.add("aab");
    FORMULA.add("aab,");
    FORMULA.add("aac,");
    FORMULA.add("\"sumdigit\"");
  }

  static String formulaProtect(final String name) {
    final String[] parts = name.split("\\s+");
    if (parts.length <= 1) {
      return name;
    }
    final boolean[] formula = new boolean[parts.length];
    // Start at 1 because part 0 is the A-number
    for (int k = 1; k < parts.length; ++k) {
      final String pk = parts[k];
      formula[k] = FORMULA.contains(pk);
      for (final char c : SPECIAL) {
        formula[k] |= pk.indexOf(c) >= 0;
      }
    }
    for (int k = 0; k < parts.length; ++k) {
      if (!formula[k] && parts[k].length() == 1 && (k == 0 || formula[k - 1]) && (k == parts.length - 1 || formula[k + 1])) {
        formula[k] = true;
      }
    }
    for (int k = 0; k < parts.length; ++k) {
      if (formula[k]) {
        if ((!parts[k].startsWith("(mod") && parts[k].matches("[({\\[][A-Za-z]{2,}")) || parts[k].matches("[({\\[]?[A-Za-z]{2,}[)}\\]][.,;]?")) {
          formula[k] = false;
        }
        if (formula[k] && (k == 0 || !formula[k - 1]) && (k == parts.length - 1 || !formula[k + 1])) {
          if (parts[k].length() == 1
            || parts[k].matches("[0-9,.;/-]+")
            || parts[k].matches("[a-zA-Z]{2,}/[a-zA-Z]{2,}")
            || parts[k].matches("[a-zA-Z0-9]+-[a-zA-Z]+")
            || parts[k].matches("[4-9]th$")
            || parts[k].endsWith("1st")
            || parts[k].endsWith("2nd")
            || parts[k].endsWith("3rd")
            ) {
            formula[k] = false;
          }
        }
      }
    }
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < parts.length;) {
      if (sb.length() > 0) {
        sb.append(' ');
      }
      if (formula[k]) {
        boolean space = false;
        sb.append("<code>");
        do {
          if (space) {
            sb.append(' ');
          }
          sb.append(parts[k++]);
          space = true;
        } while (k < parts.length && formula[k]);
        sb.append("</code>");
      } else {
        sb.append(parts[k++]);
      }
    }
    return sb.toString();
  }

  private static String protect(final String name) {
    // The order of the replacements here is important
    final String s = formulaProtect(name.replace("&", "&amp;")
      .replace("<", "&lt;")
      .replace(">", "&gt;"))
      .replace("*/", "* /")
      .replaceAll("([.,;:])</code>", "</code>$1")
      .replace("'s</code>", "</code>'s")
      ;
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < s.length(); ++k) {
      final char c = s.charAt(k);
      if (c > 127) {
        sb.append("&#").append((int) c).append(';');
      } else {
        sb.append(c);
      }
    }
    if (sb.charAt(sb.length() - 1) != '.') {
      sb.append('.');
    }
    return sb.toString();
  }

  private static List<String> loadNames(final String namesFile) throws IOException {
    final ArrayList<String> names = new ArrayList<>();
    names.add(""); // 0th sequence not used
    try (final FileInputStream f = new FileInputStream(namesFile);
         final BufferedReader reader = new BufferedReader(new InputStreamReader(namesFile.endsWith(".gz") ? new GZIPInputStream(f) : f, StandardCharsets.UTF_8))) {
      String line;
      while ((line = reader.readLine()) != null) {
        if (!line.isEmpty() && !line.startsWith("#")) {
          final int n = Integer.parseInt(line.substring(1, A_NUMBER_LENGTH + 1));
          // There can be some gaps in the names file (for not yet allocated sequences etc.)
          while (n > names.size()) {
            names.add(""); // Make dummy entries for as yet non-existent sequences
          }
          if (n != names.size()) {
            throw new IOException("Number mismatch in " + line + " (expected A" + names.size() + ")");
          }
          names.add(protect(line));
        }
      }
    }
    return names;
  }

  private static void checkAndUpdateFile(final File sequenceFile, final String name) throws IOException {
    if (name.isEmpty()) {
      System.out.println(sequenceFile + ": No name defined in names.gz");
      return;
    }
    final String javaSource = IOUtils.readAll(sequenceFile);
    if (javaSource.contains(name)) {
      return; // Already contains expected title, nothing to do
    }
    final String aNumber = sequenceFile.getName().substring(0, A_NUMBER_LENGTH + 1);
    if (!javaSource.contains(aNumber)) {
      System.out.println(sequenceFile + ": Appears to be missing " + aNumber + " comment, skipping it");
      return;
    }
    // Found a sequence, but the current name mismatches, replace it
    int start = javaSource.indexOf(" * " + aNumber);
    if (start == -1) {
      System.out.println(sequenceFile + ": No A-number found, trying for first comment line");
      start = javaSource.indexOf(" * ");
    }
    final int end = javaSource.indexOf('\n', start);
    if (start < 0 || end < 0) {
      System.out.println(sequenceFile + ": Couldn't determine where name goes, skipping");
      return;
    }
    final String newSource = javaSource.substring(0, start) + " * " + name + javaSource.substring(end);
    if (!newSource.equals(javaSource)) {
      System.out.println(sequenceFile + ": Updated name to " + name);
      try (final PrintStream out = new PrintStream(sequenceFile)) {
        out.print(newSource);
      }
    }
  }

  private static void checkAndUpdateSequences(final List<String> names, final File file) throws IOException {
    if (file.isFile()) {
      if (file.getName().matches("A[0-9]{" + A_NUMBER_LENGTH + "}.java")) {
        final int n = Integer.parseInt(file.getName().substring(1, A_NUMBER_LENGTH + 1));
        if (n < names.size()) {
          checkAndUpdateFile(file, names.get(n));
        }
      }
      return;
    }
    if (file.isDirectory()) {
      // Recursively scan looking for more files
      final File[] lst = file.listFiles();
      if (lst != null) {
        for (final File f : lst) {
          checkAndUpdateSequences(names, f);
        }
      }
    }
  }

  /**
   * Name checking and updating.
   * @param args names archive and directory containing sequence implementations
   * @throws IOException if an I/O error occurs
   */
  public static void main(final String[] args) throws IOException {
    if (args.length != 2) {
      System.err.println("Usage: Names names.gz joeis-dir");
      return;
    }
    final String namesFile = args[0];
    final String joeisDir = args[1];
    final List<String> names = loadNames(namesFile);
    checkAndUpdateSequences(names, new File(joeisDir));
  }
}

