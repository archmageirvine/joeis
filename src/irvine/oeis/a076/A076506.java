package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076506 3 people at a party are saying Hello to each other. Person 1 says Hello. Person 2 counts the times Hello has been said and says Hello twice that number. Person 3 says Hello 3 times the sum of Hello's and then it is Person 1 again. This is how the sum of Hello's.
 * @author Sean A. Irvine
 */
public class A076506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076506() {
    super(new long[] {24, 0, 0}, new long[] {1, 3, 12});
  }
}
