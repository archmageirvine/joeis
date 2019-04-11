package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005023 Number of walks of length <code>2n+7</code> in the path graph P_8 from one end to the other.
 * @author Sean A. Irvine
 */
public class A005023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005023() {
    super(new long[] {-1, 10, -15, 7}, new long[] {7, 34, 143, 560});
  }
}

