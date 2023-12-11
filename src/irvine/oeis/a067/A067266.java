package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002321;

/**
 * A067266 Numbers n such that omega(n)=M(n) where omega(n) is A001221(n) and M(n) is the Mertens function A002321(n).
 * @author Sean A. Irvine
 */
public class A067266 extends A002321 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).omega() == super.next().longValueExact()) {
        return Z.valueOf(mN);
      }
    }
  }
}

