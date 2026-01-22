package irvine.oeis.a389;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389544 a(n) is the smallest integer greater than a(n-1) such that all consecutive products in a(1)..a(n) are distinct, with a(1) = 2.
 * @author Sean A. Irvine
 */
public class A389544 extends Sequence1 {

  // After Michael S. Branicky

  private Z mA = null;
  private final HashSet<Z> mConP = new HashSet<>();
  private HashSet<Z> mEndP = new HashSet<>();

  private boolean is(final Z k) {
    if (mConP.contains(k)) {
      return false;
    }
    for (final Z p : mEndP) {
      if (mConP.contains(k.multiply(p))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      mConP.add(Z.ONE);
      mConP.add(Z.TWO);
      mEndP.add(Z.ONE);
      mEndP.add(Z.TWO);
      return mA;
    }
    while (true) {
      mA = mA.add(1);
      if (is(mA)) {
        final HashSet<Z> newEndP = new HashSet<>();
        newEndP.add(mA);
        for (final Z p : mEndP) {
          newEndP.add(mA.multiply(p));
        }
        mEndP = newEndP;
        mConP.addAll(mEndP);
        return mA;
      }
    }
  }
}

