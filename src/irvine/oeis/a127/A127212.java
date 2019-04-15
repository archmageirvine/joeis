package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127212 <code>a(n) = 5^n*Lucas(n),</code> where Lucas = A000204.
 * @author Sean A. Irvine
 */
public class A127212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127212() {
    super(new long[] {25, 5}, new long[] {5, 75});
  }
}
