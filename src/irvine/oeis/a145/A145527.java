package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145527 Numbers n such that there exists x in N : (x+91)^3-x^3=n^2.
 * @author Sean A. Irvine
 */
public class A145527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145527() {
    super(new long[] {-1, 1454}, new long[] {8281, 12032293});
  }
}
