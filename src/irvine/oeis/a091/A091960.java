package irvine.oeis.a091;
// Generated by gen_seq4.pl 2024-12-20.ack/multrar at 2024-12-20 14:00

import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A091960 a(1)=1, a(2n)=a(2n-1)+(a(n)mod 2), a(2n+1)=a(2n)+1.
 * @author Georg Fischer
 */
public class A091960 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A091960() {
    super(1, (self, n) -> ((n & 1) == 1) ? self.a(n - 1).add(1) : self.a(n - 1).add(self.a(n / 2).and(Z.ONE)), "1");
  }
}
