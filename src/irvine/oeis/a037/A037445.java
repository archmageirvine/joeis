package irvine.oeis.a037;

import irvine.math.z.InfinitaryDivisors;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037445.
 * @author Sean A. Irvine
 */
public class A037445 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return InfinitaryDivisors.infinitarySigma0(Z.valueOf(++mN));
  }
}
