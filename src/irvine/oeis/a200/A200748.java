package irvine.oeis.a200;
// Generated by ./gen_seq4.pl /partsum0 at 2022-07-13 15:15

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a130.A130493;

/**
 * A200748 Smallest number requiring n terms to be expressed as a sum of factorials.
 * @author Sean A. Irvine
 */
public class A200748 extends PartialSumSequence {

  /** Construct the sequence. */
  public A200748() {
    super(new PrependSequence(new A130493(), 0));
  }
}
