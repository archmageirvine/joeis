package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000188;
import irvine.oeis.a055.A055229;

/**
 * A056622.
 * @author Sean A. Irvine
 */
public class A056622 extends A000188 {

  private final Sequence mA = new A055229();

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
