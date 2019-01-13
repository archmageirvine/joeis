package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024778.
 * @author Sean A. Irvine
 */
public class A024778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024778() {
    super(new long[] {-864, 1140, -305, 30}, new long[] {1, 30, 595, 9840});
  }
}
