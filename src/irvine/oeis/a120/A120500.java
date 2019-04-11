package irvine.oeis.a120;

import irvine.oeis.FiniteSequence;

/**
 * A120500 Times in hours,minutes and seconds (to the nearest second) at which the smoothly crossing minute and hour hands of <code>an</code> analog clock coincide, over a period of one complete 12-hour sweep of the hour hand.
 * @author Georg Fischer
 */
public class A120500 extends FiniteSequence {

  /** Construct the sequence. */
  public A120500() {
    super(0, 10527, 21055, 31622, 42149, 52716, 63244, 73811, 84338, 94905, 105433, 120000);
  }
}
