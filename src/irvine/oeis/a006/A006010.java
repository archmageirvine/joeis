package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006010 Number of paraffins (see Losanitsch reference for precise definition).
 * @author Sean A. Irvine
 */
public class A006010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006010() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {1, 5, 20, 52, 117, 225, 400});
  }
}

