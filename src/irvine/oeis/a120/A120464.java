package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120464 <code>a(n) = 5*a(n-1)+a(n-2)-2*a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A120464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120464() {
    super(new long[] {-2, 1, 5}, new long[] {0, 2, 11});
  }
}
