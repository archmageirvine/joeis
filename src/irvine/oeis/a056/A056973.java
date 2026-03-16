package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a023.A023416;
import irvine.oeis.a033.A033264;

/**
 * A056973 Number of blocks of {0,0} in the binary expansion of n.
 * @author Sean A. Irvine
 */
public class A056973 extends Sequence1 {

  private final Sequence mB = new A023416().skip();
  private final Sequence mA = new A033264().skip();

  @Override
  public Z next() {
    return mB.next().subtract(mA.next());
  }
}
