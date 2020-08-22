package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158317 400n - 1.
 * @author Sean A. Irvine
 */
public class A158317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158317() {
    super(new long[] {-1, 2}, new long[] {399, 799});
  }
}
