package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145122 Numbers X such that (X+19)^3-X^3 is a square.
 * @author Sean A. Irvine
 */
public class A145122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145122() {
    super(1, new long[] {1, -303, 303}, new long[] {38, 14383, 4346478});
  }
}
