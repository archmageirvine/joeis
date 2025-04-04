package irvine.oeis.a309;
// Generated by gen_seq4.pl 2025-03-26.ack/lambdan at 2025-03-26 22:40

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A309104 a(n) = Sum_{k &gt;= 0} floor(n^(2*k+1) / (2*k+1)!).
 * @author Georg Fischer
 */
public class A309104 extends LambdaSequence {

  /** Construct the sequence. */
  public A309104() {
    super(0, n -> {
      Z v = Z.ZERO;
      Q d = new Q(n);
      int k = 2;
      while (true) {
        if (d.compareTo(Q.ONE) < 0) {
          return v;
        }
        v = v.add(d.floor());
        d = d.multiply(new Q(n * n, k * (k + 1)));
        k += 2;
      }
    });
  }
}
