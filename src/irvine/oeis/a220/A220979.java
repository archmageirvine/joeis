package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220979.
 * @author Sean A. Irvine
 */
public class A220979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220979() {
    super(new long[] {9765625, -12203125, 2538250, -101530, 781}, new long[] {11, 12851, 9384251, 6054921251L, 3808599606251L});
  }
}
