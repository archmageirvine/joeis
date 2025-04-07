package irvine.oeis.a091;
// manually 2025-04-08.ack/multrar at 2025-04-08 00:02

import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A091959 a(1)=1, a(2n)=(a(n)+1) mod 2, a(2n+1)=2*a(2n)+1.
 * @author Georg Fischer
 */
public class A091959 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A091959() {
    super(1, (self, n) -> (n & 1) == 0 ? self.a(n / 2).add(1).and(Z.ONE) : self.a(n - 1).multiply(2).add(1), "1");
  }
}
