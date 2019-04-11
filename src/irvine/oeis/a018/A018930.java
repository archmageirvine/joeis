package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018930 <code>a(1)=3</code>; for <code>n&gt;1, a(n)</code> is smallest positive integer such that <code>a(1)^2+...+a(n)^2 =</code> m^2 for some m.
 * @author Sean A. Irvine
 */
public class A018930 implements Sequence {

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
      return q;
    }
  }
}

