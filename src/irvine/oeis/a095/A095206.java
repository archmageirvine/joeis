package irvine.oeis.a095;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A095206 Let n = d(1),d(2),...,d(m) be the decimal representation of n and f(k) be the number obtained by deleting all occurrences of digit k from n, then a(n) = Sum_{k=1..m, d(k)!=0} f(d(k)) mod d(k).
 * @author Sean A. Irvine
 */
public class A095206 extends AbstractSequence {

  private long mN = 0;

  /** Construct the sequence. */
  public A095206() {
    super(20);
  }

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final int[] cnts = ZUtils.digitCounts(mN);
    Z sum = Z.ZERO;
    for (int k = 1; k < 10; ++k) {
      long p = 0;
      for (int j = 0; j < s.length(); ++j) {
        final int c = s.charAt(j) - '0';
        if (c != k) {
          p *= 10;
          p += c;
        }
      }
      sum = sum.add((p % k) * cnts[k]);
    }
    return sum;
  }
}
