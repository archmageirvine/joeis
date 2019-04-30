package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087619 <code>a(n) = 137a(n-1) + a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 137</code>.
 * @author Sean A. Irvine
 */
public class A087619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087619() {
    super(new long[] {1, 137}, new long[] {2, 137});
  }
}
