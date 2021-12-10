package irvine.oeis.a327;
// manually invbinom/binomtf at 2021-12-09 16:15

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001187;
import irvine.oeis.transform.BinomialTransform;

/**
 * A327078 Binomial transform of A001187 (labeled connected graphs), if we assume A001187(1) = 0.
 * @author Georg Fischer
 */
public class A327078 extends BinomialTransform {

  /** Construct the sequence. */
  public A327078() {
    super(new PrependSequence(2, new A001187(), 1, 0));
  }
}
