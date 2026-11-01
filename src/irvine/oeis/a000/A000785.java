package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a048.A048140;
import irvine.oeis.a048.A048141;
import irvine.oeis.a048.A048142;

/**
 * A000785 Number of asymmetrical planar partitions of n: planar partitions (A000219) that when regarded as 3-D objects have no symmetry.
 * @author Sean A. Irvine
 */
public class A000785 extends Sequence1 {

  private final Sequence mA = new A048141();
  private final Sequence mB = new A048140();
  private final Sequence mC = new A000219().skip();
  private final Sequence mD = new A048142();

  @Override
  public Z next() {
    return mA.next().subtract(mB.next().multiply(3)).add(mC.next().multiply2()).subtract(mD.next()).divide(3);
  }
}
