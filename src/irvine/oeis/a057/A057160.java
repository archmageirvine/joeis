package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057160.
 * @author Sean A. Irvine
 */
public class A057160 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft((1 << ++mN) - 1);
    long k = 0;
    Z u = Z.NEG_ONE;
    do {
      u = u.add(t);
      ++k;
    } while (!u.isProbablePrime());
    return Z.valueOf(k);
  }
}

