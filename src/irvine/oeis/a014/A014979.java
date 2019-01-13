package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014979.
 * @author Sean A. Irvine
 */
public class A014979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014979() {
    super(new long[] {1, -195, 195}, new long[] {0, 1, 210});
  }
}
