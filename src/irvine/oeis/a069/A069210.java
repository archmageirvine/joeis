package irvine.oeis.a069;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069210 a(1)=a(2)=1, a(n+2) = a(n+1)+1 if sign(sin(a(n+1))) = sign(sin(a(n))), a(n+2) = a(n)+1 otherwise.
 * @author Sean A. Irvine
 */
public class A069210 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else {
        mB = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t;
    if (CR.valueOf(mA).sin().signum() == CR.valueOf(mB).sin().signum()) {
      t = mB.add(1);
    } else {
      t = mA.add(1);
    }
    mA = mB;
    mB = t;
    return t;
  }
}

