package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164595 <code>a(n) = 10*a(n-1) - 17*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 5, a(1) = 37</code>.
 * @author Sean A. Irvine
 */
public class A164595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164595() {
    super(new long[] {-17, 10}, new long[] {5, 37});
  }
}
