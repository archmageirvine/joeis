package irvine.oeis.a143;
// manually invbinom/binomtf at 2021-12-09 12:26

import irvine.oeis.PrependSequence;
import irvine.oeis.a079.A079261;
import irvine.oeis.transform.BinomialTransform;

/**
 * A143982 Binomial transform of A079261.
 * @author Georg Fischer
 */
public class A143982 extends BinomialTransform {

  /** Construct the sequence. */
  public A143982() {
    super(new PrependSequence(new A079261(), 0));
    next();
  }
}
