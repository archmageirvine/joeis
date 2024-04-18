package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053193 Cototient of odd numbers.
 * @author Sean A. Irvine
 */
public class A053193 extends Sequence1 {

  private Z mN = Z.ONE;
  
  @Override
  public Z next() {
    mN = mN.add(2);
    return mN.subtract(Functions.PHI.z(mN));
  }
}
