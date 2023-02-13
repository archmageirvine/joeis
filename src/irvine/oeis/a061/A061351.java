package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A061351 Between p and the next prime either there are no numbers or there is a single squarefree number.
 * @author Sean A. Irvine
 */
public class A061351 extends A001359 {

  private boolean mFirst = true;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.TWO;
    }
    while (true) {
      final Z p = super.next();
      if (Jaguar.factor(p.add(1)).isSquareFree()) {
        return p;
      }
    }
  }
}

