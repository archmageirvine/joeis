package irvine.oeis.a082;
// Generated by gen_seq4.pl 2024-04-17/multraf at 2024-04-17 19:29

import irvine.math.function.Functions;
import irvine.oeis.a003.A003040;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A082914 a(n) = n! / A003040(n).
 * @author Georg Fischer
 */
public class A082914 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A082914() {
    super(1, (self, n) -> Functions.FACTORIAL.z(n).divide(self.s(0)), "", new A003040());
  }
}
