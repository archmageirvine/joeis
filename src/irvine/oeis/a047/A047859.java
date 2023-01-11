package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047859 a(n) = T(2, n), where T is the array given by A047858.
 * @author Sean A. Irvine
 */
public class A047859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047859() {
    super(new long[] {4, -8, 5}, new long[] {1, 4, 11});
  }
}
