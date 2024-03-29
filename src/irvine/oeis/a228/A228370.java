package irvine.oeis.a228;
// Generated by ./gen_seq4.pl /partsum0 at 2022-07-13 15:15

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;

/**
 * A228370 Toothpick sequence from a diagram of compositions of the positive integers (see Comments lines for definition).
 * @author Sean A. Irvine
 */
public class A228370 extends PartialSumSequence {

  /** Construct the sequence. */
  public A228370() {
    super(new PrependSequence(new A228371(), 0));
  }
}
