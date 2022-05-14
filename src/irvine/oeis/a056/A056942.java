package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002024;
import irvine.oeis.a003.A003056;

/**
 * A056942 Area of rectangle needed to enclose a non-touching spiral of length n on a square lattice.
 * @author Sean A. Irvine
 */
public class A056942 extends A003056 {

  private final Sequence mA = new PrependSequence(new A002024(), 0);

  @Override
  public Z next() {
    return super.next().multiply(mA.next());
  }
}
