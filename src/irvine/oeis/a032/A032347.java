package irvine.oeis.a032;

import irvine.oeis.InverseBinomialTransformSequence;

/**
 * A032347.
 * @author Sean A. Irvine
 */
public class A032347 extends InverseBinomialTransformSequence {

  /** Construct the sequence. */
  public A032347() {
    super(new A032346(), 0);
  }
}
