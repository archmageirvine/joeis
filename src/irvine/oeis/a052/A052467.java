package irvine.oeis.a052;

import irvine.oeis.transform.BinomialTransformSequence;
import irvine.oeis.a010.A010051;

/**
 * A052467 Binomial transform of {b(n)}, where b(n)=1 for prime n and b(n)=0 otherwise.
 * @author Sean A. Irvine
 */
public class A052467 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A052467() {
    super(new A010051(), 0);
  }
}
