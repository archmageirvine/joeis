package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042449 Denominators of continued fraction convergents to sqrt(752).
 * @author Sean A. Irvine
 */
public class A042449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042449() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 9214, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 5, 7, 19, 26, 71, 168, 9143, 18454, 46051, 64505, 175061, 239566, 654193, 1547952});
  }
}
