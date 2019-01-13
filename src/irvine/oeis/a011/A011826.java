package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011826.
 * @author Sean A. Irvine
 */
public class A011826 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(3).multiply(mN).add(8).multiply(mN).add(6).divide(6);
  }
}

