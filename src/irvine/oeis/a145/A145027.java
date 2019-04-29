package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145027 <code>a(n) = a(n-1) + a(n-2) + a(n-3)</code> with <code>a(1) = 2, a(2) = 3, a(3) = 4</code>.
 * @author Sean A. Irvine
 */
public class A145027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145027() {
    super(new long[] {1, 1, 1}, new long[] {2, 3, 4});
  }
}
