package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A068506 Least highly composite number whose prime decomposition starts with 2^n.
 * @author Sean A. Irvine
 */
public class A068506 extends A002182 {

  private long mN = -1;

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final Z hc = super.next();
      if (hc.makeOdd().auxiliary() >= mN) {
        return hc;
      }
    }
  }
}

