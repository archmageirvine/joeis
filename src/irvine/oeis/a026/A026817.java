package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026817 Number of sets which can be obtained by selecting unique elements from two sets with 2n and 3n elements respectively and n common elements.
 * @author Sean A. Irvine
 */
public class A026817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026817() {
    super(new long[] {1, -3, 3}, new long[] {6, 23, 51});
  }
}
