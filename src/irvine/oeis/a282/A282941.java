package irvine.oeis.a282;

import irvine.math.z.Z;
import irvine.oeis.a000.A000730;

/**
 * A282941 a(n) = A000730(7*n).
 * @author Georg Fischer
 */
public class A282941 extends A000730 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    return result;
  }
}
