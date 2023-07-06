package irvine.oeis.a115;

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001147;
import irvine.oeis.transform.InverseInvertTransform;

/**
 * A115974 Number of Feynman diagrams (vanishing and non-vanishing) of order 2n for the proper self-energy function of quantum electrodynamics (QED).
 * @author Georg Fischer
 */
public class A115974 extends PrependSequence {

  /** Construct the sequence. */
  public A115974() {
    super(new InverseInvertTransform(0, new A001147(), 2).skip(1), 1, 2);
  }
}
