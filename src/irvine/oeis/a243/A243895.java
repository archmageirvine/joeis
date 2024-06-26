package irvine.oeis.a243;
// Generated by gen_seq4.pl 2024-04-17/multraf at 2024-04-17 19:29

import irvine.math.function.Functions;
import irvine.oeis.a000.A000290;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A243895 a(n) = prime(n^2-1).
 * @author Georg Fischer
 */
public class A243895 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A243895() {
    super(2, (self, n) -> Functions.PRIME.z(self.s(0).subtract(1)), "", new A000290());
  }
}
