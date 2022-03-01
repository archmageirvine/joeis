package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A055226 a(n) = floor(sqrt(n!)).
 * @author Georg Fischer
 */
public class A055226 extends A000142 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
