package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078294 Smallest multiple of n in which the most significant occurrence of the digit string of n is preceded and followed by the digit string of (n-1) and (n+1) as can be seen in the forward concatenation of the natural numbers.
 * @author Sean A. Irvine
 */
public class A078294 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z prefix = new Z((mN - 1) + String.valueOf(mN) + (mN + 1));
    final Z n = Z.valueOf(mN);
    Z tens = Z.ONE;
    while (true) {
      final Z w = prefix.multiply(tens);
      if (w.mod(mN) == 0) {
        return w;
      }
      final Z v = n.subtract(tens.modMultiply(prefix, n));
      if (v.compareTo(tens) < 0) {
        return w.add(v);
      }
      tens = tens.multiply(10);
    }
  }
}

