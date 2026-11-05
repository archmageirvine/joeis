package irvine.oeis.a110;
// manually 2026-11-04

import irvine.math.cr.CR;
import irvine.oeis.EgyptianFractionSequence;

/**
 * A110820 Denominator of Egyptian fraction for Euler&ampos;s constant (or Euler-Mascheroni constant) gamma.
 * @author Georg Fischer
 */
public class A110820 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A110820() {
    super(1, CR.GAMMA);
  }
}
