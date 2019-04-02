package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A082792 Smallest multiple of n beginning with 3.
 * @author Sean A. Irvine
 */
public class A082792 implements Sequence {

  protected char first() {
    return '3';
  }

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    // This is not very efficient, it simply tries each multiple in turn.
    mN = mN.add(1);
    long k = 0;
    while (true) {
      final Z z = mN.multiply(++k);
      if (z.toString().charAt(0) == first()) {
        return z;
      }
    }
  }
}

