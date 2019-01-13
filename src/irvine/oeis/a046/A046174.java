package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046174.
 * @author Sean A. Irvine
 */
public class A046174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046174() {
    super(new long[] {1, -15, 15}, new long[] {0, 1, 12});
  }
}
