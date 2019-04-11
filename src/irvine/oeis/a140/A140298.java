package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140298 <code>a(0)=1</code>; <code>a(3n+1) = a(3n)+1, a(3n+2) = a(3n+1) + a(3n)</code> (=3*A000244), <code>a(3n+3) = a(3n+2) + a(3n)</code> (=A003462(n+2)).
 * @author Sean A. Irvine
 */
public class A140298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140298() {
    super(new long[] {3, 3, 3, -1, -1}, new long[] {1, 2, 3, 4, 5});
  }
}
