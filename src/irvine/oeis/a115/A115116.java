package irvine.oeis.a115;

import irvine.oeis.a006.A006575;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A115116 Number of imprimitive (periodic) asymmetric rhythm cycles: ones having nontrivial shift automorphisms. Asymmetric rhythm cycles (A115114): binary necklaces of length 2n subject to the restriction that for any k if the k-th bead is of color 1 then the (k+n)-th bead (modulo 2n) is of color 0.
 * @author Gregory Morse
 */
public class A115116 extends PairTransformSequence {
  /** Construct the sequence. */
  public A115116() {
    super(1, new A115114(), new A006575(), (n, all, primitive) -> all.subtract(primitive));
  }
}
