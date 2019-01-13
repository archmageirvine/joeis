package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016267.
 * @author Sean A. Irvine
 */
public class A016267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016267() {
    super(new long[] {120, -142, 23}, new long[] {1, 23, 387});
  }
}
