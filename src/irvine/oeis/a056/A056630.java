package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a055.A055993;

/**
 * A056630 a(n) = A055993(n) - A034444(A056627(n)).
 * @author Sean A. Irvine
 */
public class A056630 extends A055993 {

  private final Sequence mA = new A056629();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
