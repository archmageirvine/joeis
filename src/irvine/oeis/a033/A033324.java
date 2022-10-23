package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033324 a(n) = floor(4/n).
 * @author Sean A. Irvine
 */
public class A033324 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.FOUR.divide(++mN);
  }
}

