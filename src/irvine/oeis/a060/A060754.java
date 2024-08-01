package irvine.oeis.a060;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060754 Absolute values of a certain cubic form at integer points (see Formula).
 * @author Sean A. Irvine
 */
public class A060754 extends Sequence1 {

  private static final CR LAMBDA1 = CR.PI.multiply(new Q(6, 7)).cos().multiply(2);
  private static final CR LAMBDA2 = CR.PI.multiply(new Q(4, 7)).cos().multiply(2);
  private static final CR LAMBDA3 = CR.PI.multiply(new Q(2, 7)).cos().multiply(2);
  private static final CR NEG_ONE = CR.valueOf(-1);
  private static final CR[] L1 = {CR.ONE, LAMBDA3.negate(), NEG_ONE.subtract(LAMBDA2)};
  private static final CR[] L2 = {CR.ONE, LAMBDA1.negate(), NEG_ONE.subtract(LAMBDA3)};
  private static final CR[] L3 = {CR.ONE, LAMBDA2.negate(), NEG_ONE.subtract(LAMBDA1)};
  private final TreeSet<Z> mA = new TreeSet<>();
  private final HashSet<Z> mSeen = new HashSet<>();
  private int mN = 0;
  private Z mPrev = Z.ZERO;

  private CR dot(final CR[] a, final long... b) {
    assert a.length == 3;
    return a[0].multiply(b[0]).add(a[1].multiply(b[1])).add(a[2].multiply(b[2]));
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(Z.valueOf(mN + 1).square()) >= 0) {
      ++mN;
      for (int b = 0; b <= mN; ++b) {
        for (int c = 0; c <= mN; ++c) {
          final CR prod = dot(L1, mN, b, c).multiply(dot(L2, mN, b, c)).multiply(dot(L3, mN, b, c));
          final Z t = prod.assumeInt().toZ().abs();
          if (mSeen.add(t)) { // mSeen ensures we do not report values more than once
            mA.add(t);
            //System.out.println("[" + mN + "," + b + "," + c + "] = " + t);
          }
        }
      }
    }
    final Z res = mA.pollFirst();
    if (res.compareTo(mPrev) <= 0) {
      throw new RuntimeException(res + " should have been output earlier");
    }
    mPrev = res;
    return res;
  }
}
