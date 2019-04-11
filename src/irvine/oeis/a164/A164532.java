package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164532 <code>a(n) = 6*a(n-2)</code> for <code>n &gt; 2</code>; <code>a(1) = 1, a(2) = 4</code>.
 * @author Sean A. Irvine
 */
public class A164532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164532() {
    super(new long[] {6, 0}, new long[] {1, 4});
  }
}
