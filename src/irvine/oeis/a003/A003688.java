package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003688 <code>a(n) = 3*a(n-1) + a(n-2),</code> with <code>a(1)=1</code> and <code>a(2)=4</code>.
 * @author Sean A. Irvine
 */
public class A003688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003688() {
    super(new long[] {1, 3}, new long[] {1, 4});
  }
}
