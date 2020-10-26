package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a007.A007733;

/**
 * A036259 Numbers k such that the multiplicative order of 2 modulo k is odd.
 * @author Sean A. Irvine
 */
public class A036259 extends A007733 {

  @Override
  public Z next() {
    while (true) {
      if (!super.next().isEven()) {
        return Z.valueOf(mN++);
      }
      ++mN; // skip even
    }
  }
}

