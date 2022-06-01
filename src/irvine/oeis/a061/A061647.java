package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061647 Beginning at the well for the topograph of a positive definite quadratic form with values 1, 1, 1 at a superbase (i.e., 1, 1 and 1 are the vonorms of the superbase), these numbers indicate the labels of the edges of the topograph on a path of greatest ascent.
 * @author Sean A. Irvine
 */
public class A061647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061647() {
    super(new long[] {-1, 2, 2}, new long[] {1, 3, 9});
  }
}
