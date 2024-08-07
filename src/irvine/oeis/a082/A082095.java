package irvine.oeis.a082;
// Generated by gen_seq4.pl 2024-08-02.ack/multraf at 2024-08-02 23:54

import irvine.math.function.Functions;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A082095 A 2nd order recursion: a(1)=a(2)=1, a(n) = prime(a(n-2)) + pi(a(n-1)) = A000040(a(n-2)) + A000720(a(n-1)).
 * @author Georg Fischer
 */
public class A082095 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A082095() {
    super(1, (self, n) -> Functions.PRIME.z(self.a(n - 2)).add(Functions.PRIME_PI.z(self.a(n - 1))), "1, 1");
  }
}
