package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168637 <code>a(n) = a(n-1) + a(n-2) - a(n-4)</code> starting <code>a(0)=0, a(1)=1, a(2)=a(3)=3</code>.
 * @author Sean A. Irvine
 */
public class A168637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168637() {
    super(new long[] {-1, 0, 1, 1}, new long[] {0, 1, 3, 3});
  }
}
