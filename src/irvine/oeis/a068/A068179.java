package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068179 <code>Product_{i=1..3} (i+x) / Product_(i=1..3} (i-x) = Sum_{n&gt;=0} (a(n)/b(n))*x^n</code>.
 * @author Sean A. Irvine
 */
public class A068179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068179() {
    super(new long[] {36, -36, 11}, new long[] {1, 11, 121});
  }
}
