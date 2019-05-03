package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068508 <code>a(n)=round[(a(n-1)+a(n-2))/a(n-3)]</code> starting with <code>a(1)=a(2)=a(3)=1</code>.
 * @author Sean A. Irvine
 */
public class A068508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068508() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 2, 3, 5, 4, 3});
  }
}
