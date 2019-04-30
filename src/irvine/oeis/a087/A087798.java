package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087798 <code>a(n) = 9*a(n-1) + a(n-2)</code>, starting with <code>a(0) = 2</code> and <code>a(1) = 9</code>.
 * @author Sean A. Irvine
 */
public class A087798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087798() {
    super(new long[] {1, 9}, new long[] {2, 9});
  }
}
