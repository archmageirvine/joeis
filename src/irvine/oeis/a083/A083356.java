package irvine.oeis.a083;
// Generated by ./gen_seq4.pl /partsum0 at 2022-07-13 15:15

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a060.A060872;

/**
 * A083356 Total area of all incongruent integer-sided rectangles of area &lt;= n.
 * @author Sean A. Irvine
 */
public class A083356 extends PartialSumSequence {

  /** Construct the sequence. */
  public A083356() {
    super(new PrependSequence(new A060872(), 0));
  }
}
