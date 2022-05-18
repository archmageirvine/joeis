package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000594;
import irvine.oeis.a029.A029828;

/**
 * A056947.
 * @author Sean A. Irvine
 */
public class A056947 extends A029828 {

  private final Sequence mA = new PrependSequence(new A000594(), 0);

  @Override
  public Z next() {
    return super.next().subtract(mA.next().multiply(48936)).divide(691);
  }
}
