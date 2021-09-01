package irvine.oeis.a104;
// manually (decexp) at 2021-07-25

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A104015 Binary expansion of Euler's constant (or Euler-Mascheroni constant) gamma (A001620).
 * Formula: gamma
 * @author Georg Fischer
 */
public class A104015 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A104015() {
    super(0, CR.GAMMA, 2);
  }
}
