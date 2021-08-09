package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033325 a(n) = floor(5/n).
 * @author Sean A. Irvine
 */
public class A033325 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.FIVE.divide(++mN);
  }
}

