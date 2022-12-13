package irvine.oeis.a141;
// manually anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.a031.A031215;

/**
 * A141101 a(n) = prime(2n) - 2n.
 * @author Georg Fischer
 */
public class A141101 extends A031215 {

  private int mN2 = 0;

  @Override
  public Z next() {
    mN2 += 2;
    return super.next().subtract(mN2);
  }
}
