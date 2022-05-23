package irvine.oeis.a057;

import irvine.oeis.InverseSequence;

/**
 * A057118 Permutation of natural numbers induced by the automorphism df-&gt;bf (switch from the Depth First to the Breadth First coding for the binary trees) acting on the planar binary trees encoded by A014486.
 * @author Sean A. Irvine
 */
public class A057118 extends InverseSequence {

  /** Construct the sequence. */
  public A057118() {
    super(new A057117(), 0, 0);
  }
}
