package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073003 Decimal expansion of -exp(1)*Ei(-1), also called Gompertz's constant, or the Euler-Gompertz constant.
 * @author Sean A. Irvine
 */
public class A073003 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073003() {
    super(CR.ONE.negate().ei().negate().multiply(CR.E));
  }
}
