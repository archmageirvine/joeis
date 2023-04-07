package irvine.oeis.a282;

import irvine.math.z.Z;
import irvine.oeis.a000.A000728;

/**
 * A282937 a(n) = A000728(5*n).
 * @author Georg Fischer
 */
public class A282937 extends A000728 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    return result;
  }
}
