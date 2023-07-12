package irvine.oeis.a176;
// manually 2021-06-12

import irvine.math.z.Z;
import irvine.oeis.a058.A058006;

/**
 * A176787 a(n) = (0!-1!+2!-3!....(-1)^(n-1)*(n-1)!) mod n.
 * a(n) = A058006(n) mod n.
 * @author Georg Fischer
 */
public class A176787 extends A058006 {

  private int mN = 0;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(++mN));
  }
}
