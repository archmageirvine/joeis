package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127148.
 * @author Sean A. Irvine
 */
public class A127148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127148() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-120, -15, 48, 75});
  }
}
