package irvine.oeis.a143;
// manually invbinom/binomtf at 2021-12-09 12:26

import irvine.oeis.PrependSequence;
import irvine.oeis.a079.A079260;
import irvine.oeis.transform.BinomialTransform;

/**
 * A143980 Binomial transform of A079260.
 * @author Georg Fischer
 */
public class A143980 extends BinomialTransform {

  /** Construct the sequence. */
  public A143980() {
    super(new PrependSequence(new A079260(), 0));
    next();
  }
}
