package irvine.oeis.a383;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383342 Lexicographically earliest infinite sequence of distinct positive integers such that the number following any consecutive pair x, y of terms is the smallest novel number divisible by R(x,y) = rad(x*y)/rad(gcd(x,y)).
 * @author Sean A. Irvine
 */
public class A383342 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;
  private Z mB = null;
  private Z mS = Z.THREE;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        mUsed.add(Z.ONE);
        return Z.ONE;
      }
      mB = Z.TWO;
      mUsed.add(Z.TWO);
      return Z.TWO;
    }
    while (mUsed.remove(mS)) {
      mS = mS.add(1);
    }
    final Z d = Functions.RAD.z(mA.multiply(mB)).divide(Functions.RAD.z(Functions.GCD.z(mA, mB)));
    Z k = mS.subtract(1).divide(d).add(1).multiply(d);
    while (!mUsed.add(k)) {
      k = k.add(d);
    }
    mA = mB;
    mB = k;
    return k;
  }
}
