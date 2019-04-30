package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192806 <code>a(n) = 7*a(n-1) - 5*a(n-2) + a(n-3)</code>, with initial values <code>a(0) = a(1) = 1, a(2)=4</code>.
 * @author Sean A. Irvine
 */
public class A192806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192806() {
    super(new long[] {1, -5, 7}, new long[] {1, 1, 4});
  }
}
