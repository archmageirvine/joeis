package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A108963.
 * @author Sean A. Irvine
 */
public class A108963 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = mN; k >= 1; --k) {
      sb.append(k);
    }
    for (int k = 2; k <= mN; ++k) {
      sb.append(k);
    }
    final Z modulus = new Z(sb);
    Z p = modulus.add(1);
    while (!p.isProbablePrime()) {
      p = p.add(modulus);
    }
    return p;
  }
}

