package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252360.
 * @author Sean A. Irvine
 */
public class A252360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252360() {
    super(new long[] {1, -483, 483}, new long[] {289, 139217, 67102225});
  }
}
