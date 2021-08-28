package irvine.oeis.a123;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A123568 Prime numbers of the form (10^n - 7)/3.
 * @author Sean A. Irvine
 */
public class A123568 implements Sequence {

  private Z mT = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(10).add(3);
      final Z a = mT.multiply(10).add(1);
      if (a.isProbablePrime()) {
        return a;
      }
    }
  }
}
