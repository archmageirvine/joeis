package irvine.oeis.a143;
// manually invbinom/binomtf at 2021-12-09 12:26

import irvine.oeis.PrependSequence;
import irvine.oeis.a012.A012245;
import irvine.oeis.transform.BinomialTransform;

/**
 * A143963 Binomial transform of A012245.
 * @author Georg Fischer
 */
public class A143963 extends BinomialTransform {

  /** Construct the sequence. */
  public A143963() {
    super(new PrependSequence(new A012245(), 0));
  }
}
