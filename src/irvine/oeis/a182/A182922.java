package irvine.oeis.a182;
// Generated by gen_seq4.pl 2024-04-17/multraf at 2024-04-17 19:29

import irvine.math.function.Functions;
import irvine.oeis.a055.A055773;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A182922 a(n) = n! / A055773(n).
 * @author Georg Fischer
 */
public class A182922 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A182922() {
    super(0, (self, n) -> Functions.FACTORIAL.z(n).divide(self.s(0)), "", new A055773());
  }
}
