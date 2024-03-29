package irvine.oeis.a307;
// Generated by gen_seq4.pl beatty2 at 2021-07-10 18:19

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A307513 Beatty sequence for 1/log(2).
 * @author Georg Fischer
 */
public class A307513 extends BeattySequence {

  /** Construct the sequence. */
  public A307513() {
    super(1, CR.ONE.divide(CR.TWO.log()));
  }
}
