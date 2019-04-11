package irvine.oeis.a163;

import irvine.oeis.FiniteSequence;

/**
 * A163423 Numbers n with property that <code>n^2</code> is a sum of three successive cubes.
 * @author Georg Fischer
 */
public class A163423 extends FiniteSequence {

  /** Construct the sequence. */
  public A163423() {
    super(0, 3, 6, 204);
  }
}
