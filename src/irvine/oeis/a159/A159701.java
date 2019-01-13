package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159701.
 * @author Sean A. Irvine
 */
public class A159701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159701() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {925, 967, 1013, 4537, 4835, 5153});
  }
}
