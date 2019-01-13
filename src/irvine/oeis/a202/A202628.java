package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202628.
 * @author Sean A. Irvine
 */
public class A202628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202628() {
    super(new long[] {-4096, 6656, -1040, -1480, -65, 26}, new long[] {5, 125, 4905, 104845, 2236945, 43997205});
  }
}
