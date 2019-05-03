package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145205 Numbers X such that <code>(X^2-67)/201</code> is a square.
 * @author Sean A. Irvine
 */
public class A145205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145205() {
    super(new long[] {-1, 1030190}, new long[] {4154, 4279405106L});
  }
}
