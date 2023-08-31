package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A065347 Positions of zeros in A065344, i.e., binomial(2n,n) mod ((n+1)*(n+2)) = 0.
 * @author Sean A. Irvine
 */
public class A065347 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065347() {
    super(1, new A065344(), Z::isZero);
  }
}
