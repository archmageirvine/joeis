package irvine.oeis.a126;
// Generated by gen_seq4.pl 2024-07-05/multraf at 2024-07-05 23:59

import irvine.oeis.a145.A145094;
import irvine.oeis.a282.A282154;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A126858 Coefficients in quasimodular form F_2(q) of level 1 and weight 6.
 * @author Georg Fischer
 */
public class A126858 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A126858() {
    super(0, (self, n) -> self.s(0).divide(240).subtract(self.s(1).divide(24)).divide(6), "", new A145094(), new A282154());
  }
}
