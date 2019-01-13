package irvine.oeis.a133;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A133422.
 * @author Sean A. Irvine
 */
public class A133422 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z n = mN;
    long c = 0;
    while (!Z.ONE.equals(n)) {
      n = A133421.step(n);
      ++c;
    }
    return Z.valueOf(c);
  }
}

