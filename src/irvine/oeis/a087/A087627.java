package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087627 Count ...n,2n,2n...
 * @author Sean A. Irvine
 */
public class A087627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087627() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 2, 2, 2, 4, 4});
  }
}
