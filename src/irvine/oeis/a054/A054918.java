package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000273;
import irvine.oeis.a003.A003085;

/**
 * A054918 Number of connected unlabeled digraphs with n nodes such that complement is also connected.
 * @author Sean A. Irvine
 */
public class A054918 extends A003085 {

  private final Sequence mA = new A000273().skip(1);

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mA.next());
  }
}
