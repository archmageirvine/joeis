package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158367.
 * @author Sean A. Irvine
 */
public class A158367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158367() {
    super(new long[] {1, -3, 3}, new long[] {531, 2120, 4767});
  }
}
