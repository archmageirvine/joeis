package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017827 <code>a(n) = a(n-4) + a(n-5)</code>, with <code>a(0)=1, a(1)=a(2)=a(3)=0, a(4)=1</code>.
 * @author Sean A. Irvine
 */
public class A017827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017827() {
    super(new long[] {1, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1});
  }
}
