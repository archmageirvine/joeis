package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002829 Number of trivalent (or cubic) labeled graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A002829 extends AbstractSequence {

  /** Construct the sequence. */
  public A002829() {
    super(0);
  }

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private final ArrayList<Q> mSub = new ArrayList<>();
  private int mN = -1;

  private Q sub(final int n) {
    while (n >= mSub.size()) {
      final int i = mSub.size();
      Q a = Q.ZERO;
      for (int j = 0; j <= i; ++j) {
        final Z jf = mF.factorial(j);
        Z threes = Z.ONE;
        for (int k = 0; k <= 2 * (i - j); ++k, threes = threes.multiply(3)) {
          final Z den = jf.multiply(threes).multiply(mF.factorial(k)).multiply(mF.factorial(2 * i - 2 * j - k));
          a = a.signedAdd(((j + k) & 1) == 0, new Q(mF.doubleFactorial(2 * i + 2 * k - 1), den));
        }
      }
      a = a.multiply(new Q(Z.THREE.pow(i), Z.ONE.shiftLeft(i)));
      mSub.add(a);
    }
    return mSub.get(n);
  }

  @Override
  public Z next() {
    ++mN;
    Q s = Q.ZERO;
    for (int i = 0; i <= mN; ++i) {
      s = s.add(sub(i).divide(mF.factorial(mN - i)));
    }
    return s.multiply(mF.factorial(2 * mN)).divide(Z.SIX.pow(mN)).toZ();
  }
}
