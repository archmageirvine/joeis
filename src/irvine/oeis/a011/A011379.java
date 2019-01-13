package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011379.
 * @author Sean A. Irvine
 */
public class A011379 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).square().multiply(mN + 1);
  }
}

