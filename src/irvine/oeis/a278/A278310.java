package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278310.
 * @author Sean A. Irvine
 */
public class A278310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278310() {
    super(new long[] {1, -35, 35}, new long[] {3, 143, 4899});
  }
}
