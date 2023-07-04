package irvine.oeis.a064;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064390 Numbers of the form 2^k*(2^n+1) or 2^k*(4^n-2^n+1).
 * @author Sean A. Irvine
 */
public class A064390 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mB = 1;
  private int mC = 2;
  private Z mBz = Z.THREE;
  private Z mCz = Z.valueOf(13);
  {
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z f = mA.first();
    if (f.compareTo(mBz) >= 0) {
      mA.add(mBz);
      mBz = Z.ONE.shiftLeft(++mB).add(1);
    }
    if (f.compareTo(mCz) >= 0) {
      mA.add(mCz);
      mCz = Z.ONE.shiftLeft(2L * ++mC).subtract(Z.ONE.shiftLeft(mC)).add(1);
    }
    final Z res = mA.pollFirst();
    mA.add(res.multiply2());
    return res;
  }
}

