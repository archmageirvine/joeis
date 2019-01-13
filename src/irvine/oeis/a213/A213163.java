package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213163.
 * @author Sean A. Irvine
 */
public class A213163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213163() {
    super(new long[] {1, -7, 17, -17, 7}, new long[] {1, 7, 32, 122, 422});
  }
}
