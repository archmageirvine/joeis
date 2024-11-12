package irvine.oeis.a073;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073042 Numbers of the form 10^s*t^2 or 10^s*t^3, s,t &gt;= 0.
 * @author Sean A. Irvine
 */
public class A073042 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mS = Z.TWO;
  private Z mC = Z.TWO;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.ONE);
      return Z.ZERO;
    }
    final Z s = mS.square();
    if (s.compareTo(mA.first()) <= 0) {
      mA.add(s);
      mS = mS.add(1);
    }
    final Z c = mC.pow(3);
    if (c.compareTo(mA.first()) <= 0) {
      mA.add(c);
      mC = mC.add(1);
    }
    final Z res = mA.pollFirst();
    mA.add(res.multiply(10));
    return res;
  }
}
