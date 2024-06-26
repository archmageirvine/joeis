package irvine.oeis.a084;
// Generated by gen_seq4.pl 2024-05-27/multrar at 2024-05-28 02:23

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A084598 a(1) = 2, a(2) = 3; for n &gt;= 2, a(n+1) is smallest prime factor of (Product_{k = 1..n} a(k)) - 1.
 * @author Georg Fischer
 */
public class A084598 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A084598() {
    super(1, (self, n) -> Functions.LPF.z(Integers.SINGLETON.product(1, n - 1, k -> self.a(k)).subtract(1)), "2, 3");
  }
}
