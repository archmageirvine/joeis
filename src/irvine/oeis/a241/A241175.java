package irvine.oeis.a241;

import irvine.oeis.FiniteSequence;

/**
 * A241175 Numbers which cannot be obtained by adding some digit of a number m to m.
 * @author Georg Fischer
 */
public class A241175 extends FiniteSequence {

  /** Construct the sequence. */
  public A241175() {
    super(1, 3, 5, 7, 9, 21, 43, 65, 87);
  }
}
