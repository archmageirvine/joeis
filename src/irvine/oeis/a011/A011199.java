package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011199.
 * @author Sean A. Irvine
 */
public class A011199 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 1).multiply(2 * mN + 1).multiply(3 * mN + 1);
  }
}

