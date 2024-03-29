package irvine.oeis.a172;
// Generated by gen_seq4.pl beatty2 at 2021-07-10 18:19

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A172475 a(n) = floor(n*sqrt(3)/2).
 * @author Georg Fischer
 */
public class A172475 extends BeattySequence {

  /** Construct the sequence. */
  public A172475() {
    super(0, CR.THREE.sqrt().divide(CR.TWO));
  }
}
