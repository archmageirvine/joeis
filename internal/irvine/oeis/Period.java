package irvine.oeis;

import java.util.Locale;

import irvine.math.cr.CR;
import irvine.math.group.IntegersMod;
import irvine.math.z.Z;

/**
 * Automatically generate reciprocals of integers.
 * @author Sean A. Irvine
 */
public final class Period {

  /**
   * Automatically generate reciprocals of integers.
   * @param args number
   */
  public static void main(final String[] args) {
    final int n = Integer.parseInt(args[0]);
    final String a = args[1];
    final IntegersMod mm = new IntegersMod(n);
    final int period = mm.order(Z.TEN).intValueExact();
    final DecimalExpansionSequence seq = new DecimalExpansionSequence() {
      @Override
      protected CR getCR() {
        return CR.valueOf(n).inverse();
      }
    };
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < 10000; ++k) {
      sb.append(seq.next().toString());
    }
    for (int k = 0; k < 100; ++k) {
      final String repeat = sb.substring(k, period);
      final int pos = sb.indexOf(repeat, k + 1);
      if (pos > 0) {
        final StringBuilder out = new StringBuilder();
        final String p = a.substring(0, 4).toLowerCase(Locale.getDefault());
        out.append("package irvine.oeis.").append(p).append(";\n\nimport irvine.oeis.PeriodicSequence;\n");
        if (k > 0) {
          out.append("import irvine.oeis.PrependSequence;\n");
        }
        out.append("\n/**\n * ").append(a).append(".\n * @author Sean A. Irvine\n */\npublic class ").append(a).append(" extends ");
        out.append(k > 0 ? "PrependSequence" : "PeriodicSequence").append(" {\n\n");
        out.append("  /** Construct the sequence. */\n");
        out.append("  public ").append(a).append("() {\n");
        final String r = repeat.substring(0, pos - k).replace("", ", ");
        final String r2 = r.substring(2, r.length() - 2);
        if (k > 0) {
          out.append("    super(new PeriodicSequence(");
          out.append(r2);
          out.append("), ");
          final String preperiod = sb.substring(0, k).replace("", ", ");
          out.append(preperiod.substring(2, preperiod.length() - 2));
          out.append(");");
        } else {
          out.append("    super(");
          out.append(r2);
          out.append(");");
        }
        out.append("\n  }\n}\n");
        System.out.println(out);
        break;
      }
    }
  }
}

