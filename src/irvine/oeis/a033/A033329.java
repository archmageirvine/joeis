package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033329 a(n) = floor(9/n).
 * @author Sean A. Irvine
 */
public class A033329 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.NINE.divide(++mN);
  }
}

