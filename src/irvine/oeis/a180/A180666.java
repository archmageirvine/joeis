package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180666 Golden Triangle sums: a(n)=a(n-4)+A001654(n) with a(0)=0, a(1)=1, a(2)=2 and a(3)=6.
 * @author Sean A. Irvine
 */
public class A180666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180666() {
    super(new long[] {1, -2, -2, 1, -1, 2, 2}, new long[] {0, 1, 2, 6, 15, 41, 106});
  }
}
