package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016933 <code>a(n) = 6n + 2</code>.
 * @author Sean A. Irvine
 */
public class A016933 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016933() {
    super(new long[] {-1, 2}, new long[] {2, 8});
  }
}
