package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a002.A002083;

/**
 * A030625 n(n+Z(n)), where Z( ) is the Narayana-Zidek-Capell sequence (A002083).
 * @author Sean A. Irvine
 */
public class A030625 extends A002083 {

  {
    setOffset(0);
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().add(size() - 1).multiply(size() - 1);
  }
}

