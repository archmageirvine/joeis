package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003501 <code>a(n) = 5*a(n-1) - a(n-2)</code>, with <code>a(0) = 2, a(1) = 5</code>.
 * @author Sean A. Irvine
 */
public class A003501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003501() {
    super(new long[] {-1, 5}, new long[] {2, 5});
  }
}

