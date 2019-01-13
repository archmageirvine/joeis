package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271713.
 * @author Sean A. Irvine
 */
public class A271713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271713() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {2, 3, 7, 10, 18});
  }
}
