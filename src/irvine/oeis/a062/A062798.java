package irvine.oeis.a062;

import irvine.oeis.a001.A001405;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A062798 Inverse Moebius transform of central binomial coefficients f[x]=C(c,[x/2])=A001405[x].
 * @author Sean A. Irvine
 */
public class A062798 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A062798() {
    super(new A001405(), 1);
    next();
  }
}
