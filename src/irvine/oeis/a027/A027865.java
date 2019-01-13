package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027865.
 * @author Sean A. Irvine
 */
public class A027865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027865() {
    super(new long[] {1, -3, 3}, new long[] {55, 91, 139});
  }
}
