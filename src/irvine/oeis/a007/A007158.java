package irvine.oeis.a007;

import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A007158 Essentially n-ary operations in a certain 3-element algebra.
 * @author Sean A. Irvine
 */
public class A007158 extends InverseBinomialTransformSequence {

  /** Construct the sequence. */
  public A007158() {
    super(new A007155(), 0);
  }
}
