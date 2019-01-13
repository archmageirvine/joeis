package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016234.
 * @author Sean A. Irvine
 */
public class A016234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016234() {
    super(new long[] {45, -59, 15}, new long[] {1, 15, 166});
  }
}
