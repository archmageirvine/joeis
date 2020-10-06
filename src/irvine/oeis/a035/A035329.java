package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035329 n(2n+5)(2n+7).
 * @author Sean A. Irvine
 */
public class A035329 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(2 * mN + 5).multiply(2 * mN + 7);
  }
}

