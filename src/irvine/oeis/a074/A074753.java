package irvine.oeis.a074;
// Generated by ./gen_seq4.pl /partsum0 at 2022-07-13 15:15

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a054.A054973;

/**
 * A074753 Number of integers k such that sigma(k) &lt; n.
 * @author Sean A. Irvine
 */
public class A074753 extends PartialSumSequence {

  /** Construct the sequence. */
  public A074753() {
    super(1, new PrependSequence(new A054973(), 0));
  }
}
