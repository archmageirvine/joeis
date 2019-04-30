package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048487 <code>a(n) = T(4,n)</code>, array T given by A048483.
 * @author Sean A. Irvine
 */
public class A048487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048487() {
    super(new long[] {-2, 3}, new long[] {1, 6});
  }
}
