package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164021 <code>a(n) = 12*a(n-1) - 34*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 3, a(1) = 22</code>.
 * @author Sean A. Irvine
 */
public class A164021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164021() {
    super(new long[] {-34, 12}, new long[] {3, 22});
  }
}
