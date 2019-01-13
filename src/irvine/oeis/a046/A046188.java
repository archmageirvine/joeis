package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046188.
 * @author Sean A. Irvine
 */
public class A046188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046188() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 8, 725, 8844, 836265});
  }
}
