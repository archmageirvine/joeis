package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007061 The Ehrenfeucht-Mycielski sequence <code>(1</code>,2-version): a maximally unpredictable sequence.
 * @author Sean A. Irvine
 */
public class A007061 implements Sequence {

  private final StringBuilder mS = new StringBuilder();

  @Override
  public Z next() {
    final char bit;
    final int n = mS.length();
    if (n == 0) {
      mS.append('1');
      return Z.ONE;
    } else {
      // Find longest suffix
      for (int t = n - 1; t >= 0; --t) {
        final int pos = mS.lastIndexOf(mS.substring(n - t), n - 1 - t);
        if (pos >= 0) {
          // Found longest suffix that occurs in mS less the last bit
          bit = mS.charAt(pos + t) == '1' ? '2' : '1';  // complement
          mS.append(bit);
          return bit == '1' ? Z.ONE : Z.TWO;
        }
      }
      throw new RuntimeException();
    }
  }
}
