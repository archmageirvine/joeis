package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082761 Trinomial transform of the Fibonacci numbers <code>(A000045)</code>.
 * @author Sean A. Irvine
 */
public class A082761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082761() {
    super(new long[] {-4, 6}, new long[] {1, 4});
  }
}
