package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076508 3 people at a party are saying Hello to each other. Person " says Hello Hello. Person 3 counts the times Hello has been said and says Hello thrice that number. Person 1 says Hello equal to the sum of Hello's and then it is Person 2 again. This is the total of Hello's said.
 * @author Sean A. Irvine
 */
public class A076508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076508() {
    super(new long[] {24, 0, 0}, new long[] {2, 8, 16});
  }
}
