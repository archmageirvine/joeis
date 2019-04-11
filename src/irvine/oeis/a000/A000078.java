package irvine.oeis.a000;

import irvine.oeis.LinearRecurrence;

/**
 * A000078 Tetranacci numbers: <code>a(n) = a(n-1) + a(n-2) + a(n-3) + a(n-4)</code> with <code>a(0)=a(1)=a(2)=0, a(3)=1</code>.
 * @author Sean A. Irvine
 */
public class A000078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A000078() {
    super(new long[] {1, 1, 1, 1}, new long[] {0, 0, 0, 1});
  }
}
