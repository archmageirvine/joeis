package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226503 A single pair of rabbits (male and female) is born at the beginning of a year. Assume the following conditions: 1. Rabbits are able to mate at the age of two months. 2. Rabbit pairs are not fertile during their first 5 months of life, but thereafter give birth to 1 new male/female pairs at the end of every 3 month. 3. No rabbits die.
 * @author Sean A. Irvine
 */
public class A226503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226503() {
    super(new long[] {1, 0, 1, 0, 0}, new long[] {1, 1, 1, 1, 1});
  }
}
