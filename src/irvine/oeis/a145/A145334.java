package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145334 Numbers x such that (x+43)^3-x^3 is a square.
 * @author Sean A. Irvine
 */
public class A145334 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145334() {
    super(new long[] {1, -33711, 33711}, new long[] {1118, 38413663, 1294925303334L});
  }
}
