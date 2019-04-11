package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180670 <code>a(n) = a(n-1)+a(n-2)+a(n-3)+(8*n^3-48*n^2+112*n-96)/3</code> with <code>a(0)=0, a(1)=0</code> and <code>a(2)=1</code>.
 * @author Sean A. Irvine
 */
public class A180670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180670() {
    super(new long[] {1, -3, 3, -3, 7, -9, 5}, new long[] {0, 0, 1, 9, 42, 140, 383});
  }
}
