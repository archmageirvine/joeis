package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131895.
 * @author Sean A. Irvine
 */
public class A131895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131895() {
    super(new long[] {1, -3, 3}, new long[] {1, 9, 22});
  }
}
