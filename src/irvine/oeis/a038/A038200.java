package irvine.oeis.a038;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A038200 Row sums of triangle K(m, n), inverse to triangle T(m,n) in A020921.
 * @author Sean A. Irvine
 */
public class A038200 extends InverseBinomialTransformSequence {

  /** Construct the sequence. */
  public A038200() {
    super(1, new PrependSequence(new A000005(), 0), 0);
    next();
  }
}
