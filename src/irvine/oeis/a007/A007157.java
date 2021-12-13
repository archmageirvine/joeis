package irvine.oeis.a007;

import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A007157 Essentially n-ary operations in Kleene free algebra.
 * @author Sean A. Irvine
 */
public class A007157 extends InverseBinomialTransformSequence {

  /** Construct the sequence. */
  public A007157() {
    super(new A007154(), 0);
  }
}
