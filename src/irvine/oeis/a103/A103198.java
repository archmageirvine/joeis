package irvine.oeis.a103;
// Generated by ./gen_seq4.pl /diffseq0 at 2022-06-26 10:36

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a003.A003099;

/**
 * A103198 Number of compositions of n into a square number of parts.
 * @author Sean A. Irvine
 */
public class A103198 extends DifferenceSequence {

  /** Construct the sequence. */
  public A103198() {
    super(new PrependSequence(new A003099(), 0));
  }
}
