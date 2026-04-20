package irvine.oeis.a072;
// manually 2026-04-14

import irvine.math.z.Z;
import irvine.oeis.BriefSequence;

/**
 * A072952 Primes obtained as initial segments of the decimal expansion of the Euler-Mascheroni constant gamma = 0.5772... .
 *
 * @author Georg Fischer
 */
public class A072952 extends BriefSequence {

  /** Construct the sequence. */
  public A072952() {
    super(1, BRIEF, Z.FIVE, new Z("577"), new Z("5772156649015328606065120900824024310421"),
      new Z("57721566490153286060651209008240243104215933593992359880576723488486772677766467093694706329174674951463144724980708248096050401448654283622417399764492353625350033374293733773767394279"));
  }
}
