package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047859 a(n) = T(2, n), array T given by A047858.
 * @author Sean A. Irvine
 */
public class A047859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047859() {
    super(new long[] {4, -8, 5}, new long[] {1, 4, 11});
  }
}
