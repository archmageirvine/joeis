package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076809.
 * @author Sean A. Irvine
 */
public class A076809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076809() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1753, 8779, 26209, 59197, 112921});
  }
}
