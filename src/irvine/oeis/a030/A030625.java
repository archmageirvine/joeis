package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a002.A002083;

/**
 * A030625 <code>n(n+Z(n))</code>, where <code>Z( )</code> is the <code>Narayana-Zidek-Capell</code> sequence <code>(A002083)</code>.
 * @author Sean A. Irvine
 */
public class A030625 extends A002083 {

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

