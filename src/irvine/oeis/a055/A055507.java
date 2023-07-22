package irvine.oeis.a055;
// manually A210000/parmof3 at 2022-02-02 22:52

import irvine.oeis.a210.A210286;

/**
 * A055507 a(n) = Sum_{k=1..n} d(k)*d(n+1-k), where d(k) is number of positive divisors of k.
 * @author Georg Fischer
 */
public class A055507 extends A210286 {

  /** Construct the sequence. */
  public A055507() {
    super(1, n -> new Long[] {1L, n}, (n, w, x, y, z) -> w * z + x * y == n);
    super.next();
  }
}
