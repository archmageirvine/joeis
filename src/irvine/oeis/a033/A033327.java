package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033327 a(n) = floor(7/n).
 * @author Sean A. Irvine
 */
public class A033327 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.SEVEN.divide(++mN);
  }
}

