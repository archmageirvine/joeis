package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a053.A053062;

/**
 * A061088 a(n) = A053062(n) / n.
 * @author Georg Fischer
 */
public class A061088 extends A053062 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
