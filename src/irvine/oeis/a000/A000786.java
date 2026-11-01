package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a048.A048140;
import irvine.oeis.a048.A048141;
import irvine.oeis.a048.A048142;

/**
 * A000786 Number of inequivalent planar partitions of n, when considering them as 3D objects.
 * @author Sean A. Irvine
 */
public class A000786 extends Sequence0 {

  private final Sequence mA = new A048141().prepend(1);
  private final Sequence mB = new A048140().prepend(1);
  private final Sequence mC = new A000219();
  private final Sequence mD = new A048142().prepend(1);

  @Override
  public Z next() {
    return mA.next().add(mB.next().multiply(3)).subtract(mC.next()).add(mD.next().multiply2()).divide(3);
  }
}

