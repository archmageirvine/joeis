package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145205 Numbers X such that (X^2-67)/201 is a square.
 * @author Sean A. Irvine
 */
public class A145205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145205() {
    super(1, new long[] {-1, 1030190}, new long[] {4154, 4279405106L});
  }
}
