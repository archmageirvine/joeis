package irvine.oeis.a084;

import irvine.oeis.SkipSequence;
import irvine.oeis.a060.A060223;
import irvine.oeis.transform.EulerTransform;

/**
 * A084784 Binomial transform = self-convolution: first column of the triangle (A084783).
 * @author Georg Fischer
 */
public class A084784 extends EulerTransform {

  /** Construct the sequence. */
  public A084784() {
    super(new SkipSequence(new A060223(), 1), 1);
  }
}
