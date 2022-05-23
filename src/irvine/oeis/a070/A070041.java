package irvine.oeis.a070;

import irvine.oeis.InverseSequence;
import irvine.oeis.a038.A038776;

/**
 * A070041 Permutation of natural numbers induced by the automorphism df-&gt;bf (from the depth-first to breadth-first encoding) acting on the rooted planar binary trees encoded by A014486. (with one-based indexing).
 * @author Sean A. Irvine
 */
public class A070041 extends InverseSequence {

  /** Construct the sequence. */
  public A070041() {
    super(new A038776());
  }
}
