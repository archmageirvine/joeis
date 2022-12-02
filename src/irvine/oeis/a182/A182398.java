package irvine.oeis.a182;

import irvine.math.z.Z;
import irvine.oeis.a031.A031971;

/**
 * A182398 a(n) = (Sum_{k=1..2n} k^2n) mod 2n.
 * @author Georg Fischer
 */
public class A182398 extends A031971 {

  private int mN = 0;

  @Override
  public Z next() {
    // a(n) = A031971(2n) mod 2n.
    ++mN;
    super.next();
    return super.next().mod(Z.valueOf(2 * mN));
  }
}
