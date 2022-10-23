package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033328 a(n) = floor(8/n).
 * @author Sean A. Irvine
 */
public class A033328 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.EIGHT.divide(++mN);
  }
}

