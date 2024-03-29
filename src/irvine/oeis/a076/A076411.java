package irvine.oeis.a076;
// Generated by ./gen_seq4.pl /partsum0 at 2022-07-13 15:15

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a075.A075802;

/**
 * A076411 Number of perfect powers &lt; n.
 * @author Sean A. Irvine
 */
public class A076411 extends PartialSumSequence {

  /** Construct the sequence. */
  public A076411() {
    super(1, new PrependSequence(new A075802(), 0));
  }
}
