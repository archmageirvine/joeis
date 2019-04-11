package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098406 <code>a(n) = (10^n + 17)/9</code>.
 * @author Sean A. Irvine
 */
public class A098406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098406() {
    super(new long[] {-10, 11}, new long[] {2, 3});
  }
}
