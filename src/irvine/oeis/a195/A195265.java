package irvine.oeis.a195;

import irvine.oeis.prime.HomePrimeSequence;

/**
 * A195265 Trajectory of 20 under iteration of the map x -&gt; A080670(x).
 * @author Sean A. Irvine
 */
public class A195265 extends HomePrimeSequence {

  /** Construct the sequence. */
  public A195265() {
    super(20, 10, true, true);
  }
}
