package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164907 <code>a(n) = (3*3^n-(-1)^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A164907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164907() {
    super(new long[] {3, 2}, new long[] {1, 5});
  }
}
