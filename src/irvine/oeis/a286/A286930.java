package irvine.oeis.a286;

import irvine.oeis.LinearRecurrence;

/**
 * A286930 Integers whose double is a square and whose triple is a cube.
 * @author Sean A. Irvine
 */
public class A286930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286930() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 72, 4608, 52488, 294912, 1125000, 3359232});
  }
}
