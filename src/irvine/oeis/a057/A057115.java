package irvine.oeis.a057;

import irvine.oeis.PositionOfNSequence;

/**
 * A057115 Order-preserving permutation of the rational numbers (x -&gt; x-1); positions in Stern-Brocot tree.
 * @author Sean A. Irvine
 */
public class A057115 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A057115() {
    super(new A057114());
  }
}
