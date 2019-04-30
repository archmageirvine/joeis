package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253852 <code>a(n) = a(n-4) * (a(n-3) + a(n-1)) / a(n-3)</code>, with <code>a(0) = a(1) = a(2) = a(3) = 1</code>.
 * @author Sean A. Irvine
 */
public class A253852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253852() {
    super(new long[] {12, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 2, 3, 4, 3, 4, 6});
  }
}
