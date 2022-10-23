package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054977 a(0)=2, a(n)=1, n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A054977 extends Sequence0 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.TWO;
    }
    return Z.ONE;
  }
}

