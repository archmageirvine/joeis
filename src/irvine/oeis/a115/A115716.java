package irvine.oeis.a115;
// Generated by ./gen_seq4.pl /diffseq0 at 2022-06-26 10:36

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a032.A032925;

/**
 * A115716 A divide-and-conquer sequence.
 * @author Sean A. Irvine
 */
public class A115716 extends DifferenceSequence {

  /** Construct the sequence. */
  public A115716() {
    super(new PrependSequence(new A032925(), 0));
  }
}
