package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017548 (12n+2)^4.
 * @author Sean A. Irvine
 */
public class A017548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017548() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {16, 38416, 456976, 2085136, 6250000});
  }
}
