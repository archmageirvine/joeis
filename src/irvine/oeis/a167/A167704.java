package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167704 a(0)=1, a(1)=0, a(2)=2, a(3)=1, a(n)=a(n-2)+a(n-3)+a(n-4) for n&gt;3.
 * @author Sean A. Irvine
 */
public class A167704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167704() {
    super(new long[] {1, 1, 1, 0}, new long[] {1, 0, 2, 1});
  }
}
