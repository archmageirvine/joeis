package irvine.oeis.a062;

import irvine.oeis.a001.A001405;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A062798 Inverse Moebius transform of A001405 (binomial(n, floor(n/2))).
 * @author Sean A. Irvine
 */
public class A062798 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A062798() {
    super(0, new A001405(), 1);
    next();
  }
}
