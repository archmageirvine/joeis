package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155609 <code>a(n) = 4^n - 3^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A155609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155609() {
    super(new long[] {12, -19, 8}, new long[] {1, 2, 8});
  }
}
