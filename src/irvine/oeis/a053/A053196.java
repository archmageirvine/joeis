package irvine.oeis.a053;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053196 Cototients of even numbers.
 * @author Sean A. Irvine
 */
public class A053196 extends Sequence1 {

  private Z mN = Z.ZERO;
  
  @Override
  public Z next() {
    mN = mN.add(2);
    return mN.subtract(Euler.phi(mN));
  }
}
