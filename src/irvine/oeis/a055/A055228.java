package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A055228 a(n) = ceiling(sqrt(n!)).
 * @author Georg Fischer
 */
public class A055228 extends A000142 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      super.next();
      return Z.ONE;
    }
    return super.next().sqrt().add(1);
  }
}
