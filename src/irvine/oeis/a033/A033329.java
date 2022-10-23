package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033329 a(n) = floor(9/n).
 * @author Sean A. Irvine
 */
public class A033329 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.NINE.divide(++mN);
  }
}

