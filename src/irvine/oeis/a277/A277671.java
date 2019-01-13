package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277671.
 * @author Sean A. Irvine
 */
public class A277671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277671() {
    super(new long[] {-1, 2, -3, 4, -5, 6, -7, 8}, new long[] {1, 8, 57, 406, 2892, 20600, 146736, 1045216});
  }
}
