package irvine.oeis.a056;

import irvine.oeis.InverseSequence;

/**
 * A056535 Mapping from the ordering by sum to the ordering by product of the ordered pairs. Inverse permutation to A056534.
 * @author Sean A. Irvine
 */
public class A056535 extends InverseSequence {

  /** Construct the sequence. */
  public A056535() {
    super(new A056534());
  }
}
