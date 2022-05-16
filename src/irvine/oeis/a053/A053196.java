package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053196 Cototients of even numbers.
 * @author Sean A. Irvine
 */
public class A053196 implements Sequence {

  private Z mN = Z.ZERO;
  
  @Override
  public Z next() {
    mN = mN.add(2);
    return mN.subtract(Jaguar.factor(mN).phi());
  }
}
