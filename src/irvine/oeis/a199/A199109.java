package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199109 a(n) = (7*3^n + 1)/2.
 * @author Sean A. Irvine
 */
public class A199109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199109() {
    super(new long[] {-3, 4}, new long[] {4, 11});
  }
}
