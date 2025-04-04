package irvine.oeis.a343;
// Generated by gen_seq4.pl 2025-02-02.ack/lambdan at 2025-02-02 21:39

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A343572 a(n) = ceiling((16^n)*Sum_{k=0..n+1} (4/(8k+1)-2/(8k+4)-1/(8k+5)-1/(8k+6))/16^k).
 * @author Georg Fischer
 */
public class A343572 extends LambdaSequence {

  /** Construct the sequence. */
  public A343572() {
    super(0, n -> Rationals.SINGLETON.sum(0, n + 1, k -> new Q(4, 8L * k + 1).subtract(new Q(2, 8L * k + 4)).subtract(new Q(1, 8L * k + 5)).subtract(new Q(1, 8L * k + 6)).divide(Z.valueOf(16).pow(k))).multiply(Z.valueOf(16).pow(n)).ceiling());
  }
}
