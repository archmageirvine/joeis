package irvine.oeis.a060;

import irvine.oeis.InverseSequence;

/**
 * A060127 Positions of permutations of A055089 in the permutation sequence A060118. Inverse permutation to A060120.
 * @author Sean A. Irvine
 */
public class A060127 extends InverseSequence {

  /** Construct the sequence. */
  public A060127() {
    super(0, new A060120(), 0, 0);
  }
}
