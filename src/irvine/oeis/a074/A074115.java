package irvine.oeis.a074;
// Generated by gen_seq4.pl 2024-04-17/multraf at 2024-04-17 19:29

import irvine.math.function.Functions;
import irvine.oeis.a000.A000793;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A074115 a(n) = n!/A000793(n).
 * @author Georg Fischer
 */
public class A074115 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A074115() {
    super(0, (self, n) -> Functions.FACTORIAL.z(n).divide(self.s(0)), "", new A000793());
  }
}
