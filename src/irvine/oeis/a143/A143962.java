package irvine.oeis.a143;
// manually invbinom/binomtf at 2021-12-09 12:26

import irvine.oeis.PrependSequence;
import irvine.oeis.a066.A066247;
import irvine.oeis.transform.BinomialTransform;

/**
 * A143962 Binomial transform of A066247 (characteristic function of composite numbers).
 * @author Georg Fischer
 */
public class A143962 extends BinomialTransform {

  /** Construct the sequence. */
  public A143962() {
    super(new PrependSequence(new A066247(), 0));
  }
}
