package irvine.oeis.a264;
// manually deris2/binomx at 2021-12-08 08:19

import irvine.oeis.PrependSequence;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A264037 Stirling transform of A077957 (aerated powers of 2) with 0 prepended [0, 1, 0, 2, 0, 4, 0, 8, ...].
 * @author Georg Fischer
 */
public class A264037 extends PrependSequence {

  /** Construct the sequence. */
  public A264037() {
    super(new BinomialTransformSequence(new A264036(), 0), 0);
  }
}
