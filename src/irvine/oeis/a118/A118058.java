package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118058 <code>a(n) = 49n^2 - 28n - 20</code>.
 * @author Sean A. Irvine
 */
public class A118058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118058() {
    super(new long[] {1, -3, 3}, new long[] {1, 120, 337});
  }
}
