package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156589 <code>a(n) = 4^n - 2^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A156589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156589() {
    super(new long[] {8, -14, 7}, new long[] {-1, 1, 11});
  }
}
