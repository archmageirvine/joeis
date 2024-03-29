package irvine.oeis.a203;
// Generated by gen_seq4.pl esf at 2022-04-27 23:16

import irvine.oeis.a008.A008619;
import irvine.oeis.transform.ElementarySymmetricFunctionSequence;

/**
 * A203152 (n-1)-st elementary symmetric function of {1, 2, 2, 3, 3, 4, 4, 5, 5, ..., floor(1+n/2)}.
 * @author Georg Fischer
 */
public class A203152 extends ElementarySymmetricFunctionSequence {

  /** Construct the sequence. */
  public A203152() {
    super(new A008619(), 1);
  }
}
