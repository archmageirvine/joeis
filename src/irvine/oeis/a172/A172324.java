package irvine.oeis.a172;
// Generated by gen_seq4.pl beatty2 at 2021-07-10 18:19

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A172324 a(n) = floor(n*(sqrt(7)+sqrt(5))).
 * @author Georg Fischer
 */
public class A172324 extends BeattySequence {

  /** Construct the sequence. */
  public A172324() {
    super(0, CR.SEVEN.sqrt().add(CR.FIVE.sqrt()));
  }
}
