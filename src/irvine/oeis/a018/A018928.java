package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018928 Define {b(n)} by b(1)=3, b(n) (n &gt;= 2) is smallest number such that b(1)^2+...+b(n)^2 = m^2 for some m and all b(i) are distinct. Sequence gives values of m.
 * @author Sean A. Irvine
 */
public class A018928 implements Sequence {

  // After Max Alekseyev

  private Z mS = null;

  @Override
  public Z next() {
    if (mS == null) {
      mS = Z.NINE;
      return Z.THREE;
    } else {
      final Z[] d = Jaguar.factor(mS).divisorsSorted();
      final Z t = d[d.length / 2 - 1];
      final Z q = mS.divide(t).subtract(t).divide2();
      mS = mS.add(q.square());
      return mS.sqrt();
    }
  }
}

