package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168613 <code>a(n) = 3^n - 5</code>.
 * @author Sean A. Irvine
 */
public class A168613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168613() {
    super(new long[] {-3, 4}, new long[] {-4, -2});
  }
}
