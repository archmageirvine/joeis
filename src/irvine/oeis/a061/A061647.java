package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061647 Beginning at the well for the topograph of a positive definite quadratic form with values <code>1, 1, 1</code> at a superbase (i.e., <code>1, 1</code> and 1 are the vonorms of the superbase), these numbers indicate the labels of the edges of the topograph on a path of greatest ascent.
 * @author Sean A. Irvine
 */
public class A061647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061647() {
    super(new long[] {-1, 2, 2}, new long[] {1, 3, 9});
  }
}
