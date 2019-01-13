package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016295.
 * @author Sean A. Irvine
 */
public class A016295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016295() {
    super(new long[] {60, -52, 13}, new long[] {1, 13, 117});
  }
}
