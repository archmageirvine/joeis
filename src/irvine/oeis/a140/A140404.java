package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140404.
 * @author Sean A. Irvine
 */
public class A140404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140404() {
    super(new long[] {-117649, 100842, -36015, 6860, -735, 42}, new long[] {1, 42, 1029, 19208, 302526, 4235364});
  }
}
