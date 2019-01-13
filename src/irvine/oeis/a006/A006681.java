package irvine.oeis.a006;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001147;

/**
 * A006681.
 * @author Sean A. Irvine
 */
public class A006681 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final A001147 mA = new A001147();
    Z sum = Z.ZERO;
    for (long k = 2; k <= mN; ++k) {
      sum = sum.add(Stirling.secondKind(mN, k).multiply(mA.next()));
    }
    return sum;
  }
}
