package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189748 a(1)=5,  a(2)=4, a(n)=5*a(n-1) + 4*a(n-2).
 * @author Sean A. Irvine
 */
public class A189748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189748() {
    super(new long[] {4, 5}, new long[] {5, 4});
  }
}
