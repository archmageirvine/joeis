package irvine.oeis.a308;
// Generated by gen_seq4.pl 2024-04-17/multrar at 2024-04-17 19:29

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A308476 a(1) = 1; a(n) = Sum_{k=1..n-1, gcd(n,k) = 1} Stirling2(n,k)*a(k).
 * @author Georg Fischer
 */
public class A308476 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A308476() {
    super(1, (self, n) -> Integers.SINGLETON.sum(1, n - 1, k -> Functions.GCD.l(n, k) == 1 ? Functions.STIRLING2.z(n, k).multiply(self.a(k)) : Z.ZERO), "1");
  }
}
