package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017323 <code>a(n) = (10*n + 4)^7</code>.
 * @author Sean A. Irvine
 */
public class A017323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017323() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {16384, 105413504, 4586471424L, 52523350144L, 319277809664L, 1338925209984L, 4398046511104L, 12151280273024L});
  }
}
