package irvine.oeis.a135;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.a076.A076954;

/**
 * A135505 a(0) = 1; a(n) = [product_(i = 1..n) prime(i)^i] - 1, where prime(i) is i-th prime.
 * @author Georg Fischer
 */
public class A135505 extends A076954 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z t = super.next().subtract(1);
    return (++mN == 0) ? Z.ONE : t;
  }
}
