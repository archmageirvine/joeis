package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038225.
 * @author Sean A. Irvine
 */
public class A038225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038225() {
    super(new long[] {-1, 7, -15, 10}, new long[] {1, 4, 30, 246});
  }
}
