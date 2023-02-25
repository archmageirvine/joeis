package irvine.oeis.a117;

import irvine.math.z.Z;
import irvine.oeis.a023.A023900;

/**
 * A117212 Sum_{d|n} a(d)/d = (-1)^(n-1)/n for n&gt;=1; equals the logarithmic g.f. of A117210.
 * <code>a(n) = A023900(n) if n (mod 4) = 1 or 3, a(n) = 3*A023900(n) if n (mod 4) = 2, a(n) = -A023900(n) if n (mod 4) = 0</code>
 * @author Georg Fischer
 */
public class A117212 extends A023900 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    switch (mN & 3) {
      case 0:
        return super.next().negate();
      case 1:
      case 3:
        return super.next();
      case 2:
      default:
        return super.next().multiply(3);
    }
  }
}
