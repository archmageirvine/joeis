package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070875 Binary expansion is 1x100...0 where x = 0 or 1.
 * @author Sean A. Irvine
 */
public class A070875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070875() {
    super(new long[] {2, 0}, new long[] {5, 7});
  }
}
