package irvine.oeis.a065;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;

/**
 * A065358 The Jacob's Ladder sequence: a(n) = Sum_{k=1..n} (-1)^pi(k), where pi = A000720.
 * @author Sean A. Irvine
 */
public class A065358 extends PartialSumSequence {

  /** Construct the sequence. */
  public A065358() {
    super(new PrependSequence(new A065357().skip(), 0));
  }
}
