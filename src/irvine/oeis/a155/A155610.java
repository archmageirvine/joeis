package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155610.
 * @author Sean A. Irvine
 */
public class A155610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155610() {
    super(new long[] {15, -23, 9}, new long[] {1, 3, 17});
  }
}
