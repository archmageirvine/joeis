package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288037 Number of (undirected) paths in the n-web graph.
 * @author Sean A. Irvine
 */
public class A288037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288037() {
    super(3, new long[] {-4, 20, -41, 44, -26, 8}, new long[] {285, 984, 2855, 7488, 18431, 43504});
  }
}
