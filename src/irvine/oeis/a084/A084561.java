package irvine.oeis.a084;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084561 Numbers with a square number of 1's in their binary expansion.
 * @author Sean A. Irvine
 */
public class A084561 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mM = 2;
  private Z mNext = Z.valueOf(15);

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.ONE);
      return Z.ZERO;
    }
    if (mA.first().compareTo(mNext) > 0) {
      mA.add(mNext);
      mNext = Z.ONE.shiftLeft(++mM * mM).subtract(1);
    }
    final Z t = mA.pollFirst();
    mA.add(Functions.SWIZZLE.z(t));
    return t;
  }
}

