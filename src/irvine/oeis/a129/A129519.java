package irvine.oeis.a129;
// Generated by ./gen_seq4.pl /diffseq0 at 2022-06-26 10:36

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a266.A266232;

/**
 * A129519 First differences of the binomial transform of the distinct partition numbers (A000009).
 * @author Sean A. Irvine
 */
public class A129519 extends DifferenceSequence {

  /** Construct the sequence. */
  public A129519() {
    super(new PrependSequence(new A266232(), 0));
  }
}
