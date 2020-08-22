package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017440 a(n) = (11*n + 4)^4.
 * @author Sean A. Irvine
 */
public class A017440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017440() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {256, 50625, 456976, 1874161, 5308416});
  }
}
