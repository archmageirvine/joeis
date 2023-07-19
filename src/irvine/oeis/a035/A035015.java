package irvine.oeis.a035;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A035015 Period of continued fraction for square root of n-th squarefree integer.
 * @author Sean A. Irvine
 */
public class A035015 extends A003285 {

  /** Construct the sequence. */
  public A035015() {
    super(2);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (LongUtils.isSquareFree(mN) && !t.isZero()) {
        return t;
      }
    }
  }
}
