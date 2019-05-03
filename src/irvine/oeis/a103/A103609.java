package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103609 Fibonacci numbers repeated <code>(cf. A000045)</code>.
 * @author Sean A. Irvine
 */
public class A103609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103609() {
    super(new long[] {1, 0, 1, 0}, new long[] {0, 0, 1, 1});
  }
}
