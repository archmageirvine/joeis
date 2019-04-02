package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145568 Characteristic function of numbers relatively prime to 11.
 * @author Sean A. Irvine
 */
public class A145568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145568() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
