package irvine.oeis.a141;

import irvine.oeis.transform.InverseInvertTransform;

/**
 * A141319 INVERTi transform of A141318.
 * @author Georg Fischer
 */
public class A141319 extends InverseInvertTransform {

  /** Construct the sequence. */
  public A141319() {
    super(1, new A141318(), 1);
  }
}
