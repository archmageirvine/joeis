package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a053.A053061;

/**
 * A061082 a(n) = A053061(n)/n.
 * @author Georg Fischer
 */
public class A061082 extends A053061 {

  private long mN = 0;
  ;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
