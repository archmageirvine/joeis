package irvine.oeis.a244;

import irvine.oeis.FiniteSequence;

/**
 * A244047 Maximal nonempty {1,3}-chunks of a 4-day-old string in a &quot;Look and Say&quot; sequence.
 * @author Georg Fischer
 */
public class A244047 extends FiniteSequence {

  /** Construct the sequence. */
  public A244047() {
    super(1, 3, 11, 13, 31, 111, 113, 131, 133, 311, 1113, 1131, 1133, 1311, 1331, 3111, 3113, 11131, 11133, 11311, 11331, 13111, 13113, 13311, 31131, 31133, 111311, 111331, 113111, 113311, 311311, 311331, 1113111, 1113311, 3113111, 3113311);
  }
}
