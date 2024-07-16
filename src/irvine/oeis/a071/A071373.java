package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071373 Least number X such that the numbers from X to X+n-1 are, in some order, 1 * a prime, 2 * a prime, ..., n * a prime.
 * @author Sean A. Irvine
 */
public class A071373 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return new A071367(++mN).next();
  }
}
