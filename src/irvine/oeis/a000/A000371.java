package irvine.oeis.a000;

import irvine.oeis.InverseBinomialTransformSequence;
import irvine.oeis.a001.A001146;

/**
 * A000371 <code>a(n) =</code> Sum_{k=0..n} <code>(-1)^(n-k)*binomial(n,k)*2^(2^k)</code>.
 * @author Sean A. Irvine
 */
public class A000371 extends InverseBinomialTransformSequence {

  /** Default constructor. */
  public A000371() {
    super(new A001146(), 0);
  }
}
