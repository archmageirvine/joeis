package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002409 <code>a(n) =</code> 2^n*C(n+6,6). Number of 6D hypercubes in an (n+6)-dimensional hypercube.
 * @author Sean A. Irvine
 */
public class A002409 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 6, 6).shiftLeft(mN);
  }
}
