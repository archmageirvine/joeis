package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008833;
import irvine.oeis.a055.A055229;

/**
 * A056622.
 * @author Sean A. Irvine
 */
public class A056623 extends A008833 {

  private final Sequence mA = new A055229();

  @Override
  public Z next() {
    return super.next().divide(mA.next().square());
  }
}
