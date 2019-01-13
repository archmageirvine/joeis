package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027820.
 * @author Sean A. Irvine
 */
public class A027820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027820() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {28, 336, 2100, 9240, 32340, 96096, 252252, 600600, 1321320, 2722720});
  }
}
