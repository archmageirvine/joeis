package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006577;
import irvine.oeis.a006.A006884;
import irvine.oeis.a006.A006885;

/**
 * A395130 In the '3x+1' problem, take the sequence of starting values which set new records for the highest point of the trajectory before reaching 1 (A006884); sequence gives the number of halving and tripling steps with which the maximal value is reached in the trajectory with that start.
 * @author Sean A. Irvine
 */
public class A395130 extends Sequence1 {

  private final Sequence mA = new A006884();
  private final Sequence mB = new A006885();
  private final DirectSequence mC = new A006577();

  @Override
  public Z next() {
    return mC.a(mA.next()).subtract(mC.a(mB.next()));
  }
}
