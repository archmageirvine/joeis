package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046916 <code>a(n) = n*2^n + 2*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A046916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046916() {
    super(new long[] {4, -16, 25, -19, 7}, new long[] {1, 5, 17, 43, 97});
  }
}
