package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180666 Golden Triangle sums: a(n)=a(n-4)+A001654(n) with <code>a(0)=0, a(1)=1, a(2)=2</code> and <code>a(3)=6</code>.
 * @author Sean A. Irvine
 */
public class A180666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180666() {
    super(new long[] {1, -2, -2, 1, -1, 2, 2}, new long[] {0, 1, 2, 6, 15, 41, 106});
  }
}
