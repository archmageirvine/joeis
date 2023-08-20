package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065182 Permutation of nonnegative integers produced when the finite permutations listed by A055089 are subjected to Foata transform. Inverse of A065181.
 * @author Sean A. Irvine
 */
public class A065182 extends InverseSequence {

  /** Construct the sequence. */
  public A065182() {
    super(0, new A065181(), 0);
  }
}
