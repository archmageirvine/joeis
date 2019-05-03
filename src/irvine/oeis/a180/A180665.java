package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180665 Golden Triangle sums: <code>a(n)=a(n-2)+A001654(n)</code> with <code>a(0)=0</code> and <code>a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A180665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180665() {
    super(new long[] {1, -2, -3, 3, 2}, new long[] {0, 1, 2, 7, 17});
  }
}
