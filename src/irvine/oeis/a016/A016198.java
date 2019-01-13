package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016198.
 * @author Sean A. Irvine
 */
public class A016198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016198() {
    super(new long[] {10, -17, 8}, new long[] {1, 8, 47});
  }
}
