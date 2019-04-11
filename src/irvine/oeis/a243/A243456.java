package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243456 <code>a(n+6) = 6*a(n+4) - 12*a(n+2) + 8*a(n), a(0)</code>..a(5) <code>= 8,0,9,0,8,0</code>.
 * @author Sean A. Irvine
 */
public class A243456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243456() {
    super(new long[] {8, 0, -12, 0, 6, 0}, new long[] {8, 0, 9, 0, 8, 0});
  }
}
