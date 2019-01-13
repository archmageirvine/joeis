package irvine.oeis;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Verify A098322 results produced by corresponding C program.
 *
 * @author Sean A. Irvine
 */
public final class A098322 {

  private A098322() { }

  private static byte[] catalan(final String file) throws IOException {
    // Do it this way to cope better with very large inputs
    final File f = new File(file);
    final int len = f.length() > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) f.length();
    final byte[] buf = new byte[len];
    try (final BufferedInputStream is = new BufferedInputStream(new FileInputStream(f))) {
      if (is.read(buf) != buf.length) {
        throw new IOException();
      }
    }
    return buf;
  }

  static int search(final byte[] buf, final String s) {
    final byte[] p = s.getBytes(StandardCharsets.US_ASCII);
    for (int k = 0; k <= buf.length - p.length; ++k) {
      boolean ok = true;
      for (int j = 0; j < p.length; ++j) {
        if (buf[k + j] != p[j]) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return k;
      }
    }
    return -1;
  }

  static void search(final String file) throws IOException {
    final byte[] g = catalan(file);
    int v = 0;
    do {
      final String k = String.valueOf(v);
      System.out.println(k);
      v = search(g, k);
    } while (v != -1);
  }

  /**
   * Produce the sequence assuming an input file starting with <code>
   * .9159655941772190</code> and continuing with a large number of digits
   * all on one line.
   *
   * @param args file name
   * @exception IOException if an I/O problem occurs.
   */
  public static void main(final String[] args) throws IOException {
    search(args[0]);
  }
}

