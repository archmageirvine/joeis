package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167190.
 * @author Sean A. Irvine
 */
public class A167190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167190() {
    super(new long[] {-1, 4, -6, 4}, new long[] {17594, 131307, 432796, 1013717});
  }
}
