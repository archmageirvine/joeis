package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038235 Bottom line of 4-wave sequence <code>A038197</code>, also bisection of <code>A006357</code>.
 * @author Sean A. Irvine
 */
public class A038235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038235() {
    super(new long[] {-1, 7, -15, 10}, new long[] {1, 10, 85, 707});
  }
}
