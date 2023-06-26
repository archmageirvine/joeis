package irvine.oeis.a130;

import irvine.oeis.FiniteSequence;

/**
 * A130808 Magic side-sum constants of magic triangles of Yates using the numbers 1 to 9.
 * @author Georg Fischer
 */
public class A130808 extends FiniteSequence {

  /** Construct the sequence. */
  public A130808() {
    super(1, FINITE, 17, 19, 20, 21, 23);
  }
}
