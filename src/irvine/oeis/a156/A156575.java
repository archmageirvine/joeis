package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156575.
 * @author Sean A. Irvine
 */
public class A156575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156575() {
    super(new long[] {1, -35, 35}, new long[] {289, 4225, 139129});
  }
}
