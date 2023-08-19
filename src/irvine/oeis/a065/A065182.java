package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A055089 List of all finite permutations in reversed colexicographic ordering.
 * @author Sean A. Irvine
 */
public class A065182 extends InverseSequence {

  /** Construct the sequence. */
  public A065182() {
    super(0, new A065181(), 0);
  }
}
