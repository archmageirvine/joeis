package irvine.oeis.a390;

import irvine.oeis.PartialSumSequence;

/**
 * A390937 Number of entries in the map T after the n-th iteration, when initially T[1] = 1 is the only entry, and in subsequent iterations, T[v] := k + (T[v] if defined else 0) for each key-value pair (k, v) in the map.
 * @author Sean A. Irvine
 */
public class A390937 extends PartialSumSequence {

  /** Construct the sequence. */
  public A390937() {
    super(0, new A390938());
  }
}
