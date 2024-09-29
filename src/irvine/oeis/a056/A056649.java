package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056649 a(n) = A056061(n) - A034444(A056647(n)).
 * @author Sean A. Irvine
 */
public class A056649 extends A056061 {

  private final Sequence mA = new A056648();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
