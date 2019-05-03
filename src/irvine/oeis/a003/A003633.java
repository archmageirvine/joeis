package irvine.oeis.a003;

import java.util.ArrayList;

import irvine.math.api.RationalSequence;
import irvine.math.q.Q;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003633 The sequence <code>2^(1-n)*a(n)</code> is fixed (up to signs) by <code>Stirling-2</code> transform.
 * @author Sean A. Irvine
 */
public class A003633 implements Sequence, RationalSequence {

  private final ArrayList<Q> mTerms = new ArrayList<>();

  @Override
  public Q nextQ() {
    if (mTerms.isEmpty()) {
      mTerms.add(null);
      mTerms.add(Q.ONE);
    } else {
      final int n = mTerms.size();
      Q a = Q.ZERO;
      for (int k = 1; k < n; ++k) {
        a = a.add(mTerms.get(k).multiply(Stirling.secondKind(n, k)));
      }
      mTerms.add(a.divide(Q.TWO).negate());
    }
    //System.out.println(mTerms);
    return mTerms.get(mTerms.size() - 1);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return nextQ().multiply(Z.ONE.shiftLeft(++mN)).toZ();
  }
}
