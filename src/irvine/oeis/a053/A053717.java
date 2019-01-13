package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053717.
 * @author Sean A. Irvine
 */
public class A053717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053717() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {8, 255, 3280, 21845, 97656, 335923, 960800, 2396745});
  }
}
