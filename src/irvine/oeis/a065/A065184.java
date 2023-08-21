package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065184 Permutation of nonnegative integers produced when the finite permutations listed by A060117 are subjected to the left-right maxima variant of Foata's transformation. Inverse of A065183.
 * @author Sean A. Irvine
 */
public class A065184 extends InverseSequence {

  /** Construct the sequence. */
  public A065184() {
    super(0, new A065183(), 0);
  }
}
