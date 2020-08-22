package irvine.oeis.a020;

import java.util.ArrayList;

import irvine.math.api.RationalSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020650 Numerators in recursive bijection from positive integers to positive rationals (the bijection is f(1) = 1, f(2n) = f(n)+1, f(2n+1) = 1/(f(n)+1)).
 * @author Sean A. Irvine
 */
public class A020650 implements Sequence, RationalSequence {

  private boolean mEven = true;
  private final ArrayList<Q> mA = new ArrayList<>();

  @Override
  public Q nextQ() {
    mEven = !mEven;
    final int n = (mA.size() - 1) / 2;
    mA.add(mA.isEmpty() ? Q.ONE : (mEven ? mA.get(n).add(1) : mA.get(n).add(1).reciprocal()));
    return mA.get(mA.size() - 1);
  }

  protected Z select(final Q a) {
    return a.num();
  }

  @Override
  public Z next() {
    return select(nextQ());
  }
}
