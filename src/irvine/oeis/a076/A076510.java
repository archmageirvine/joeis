package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076510 3 people at a party are saying Hello to each other. Person 3 says Hello Hello Hello. Person 1 counts the times Hello has been said and says Hello that number. Person 2 says Hello equal to <code>2 *</code> the sum of Hello's and then it is Person 3 again. This is the total of Hello's said.
 * @author Sean A. Irvine
 */
public class A076510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076510() {
    super(new long[] {24, 0, 0}, new long[] {3, 6, 18});
  }
}
