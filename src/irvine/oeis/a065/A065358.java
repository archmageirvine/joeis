package irvine.oeis.a065;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;

/**
 * A064933.
 * @author Sean A. Irvine
 */
public class A065358 extends PartialSumSequence {

  /** Construct the sequence. */
  public A065358() {
    super(new PrependSequence(new A065357().skip(), 0));
  }
}
