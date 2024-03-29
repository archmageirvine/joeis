package irvine.oeis.a098;
// Generated by gen_seq4.pl beatty2 at 2021-07-10 18:19

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A098005 Beatty sequence for 1/(3 - e): a(n) = floor(n/(3-e)).
 * @author Georg Fischer
 */
public class A098005 extends BeattySequence {

  /** Construct the sequence. */
  public A098005() {
    super(1, CR.ONE.divide(CR.THREE.subtract(CR.E)));
  }
}
