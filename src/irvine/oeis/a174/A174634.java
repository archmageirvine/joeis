package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174634 <code>a(n) =</code> 3^n*F(n+2).
 * @author Sean A. Irvine
 */
public class A174634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174634() {
    super(new long[] {9, 3}, new long[] {1, 6});
  }
}
