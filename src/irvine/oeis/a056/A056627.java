package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a055.A055230;
import irvine.oeis.a055.A055772;

/**
 * A056627 a(n) = A056622(n!).
 * @author Sean A. Irvine
 */
public class A056627 extends A055772 {

  private final Sequence mA = new A055230();

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
