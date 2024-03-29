package irvine.oeis.a244;
// Generated by gen_seq4.pl decexp at 2021-07-12 23:03

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A244089 Decimal expansion of sqrt((3+sqrt(13))/2), a constant related to the asymptotic evaluation of the number of self-avoiding rook paths joining opposite corners on a 3 X n chessboard.
 * @author Georg Fischer
 */
public class A244089 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A244089() {
    super(1, CR.THREE.add(CR.valueOf(13).sqrt()).divide(CR.TWO).sqrt());
  }
}
