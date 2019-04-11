package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.math.api.RationalSequence;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A003633 The sequence <code>2^(1-n)*a(n)</code> is fixed (up to signs) by Stirling-2 transform.
 * @author Sean A. Irvine
 */
public class A003633 implements Sequence {

  private static class A003633Q implements RationalSequence {

    private final ArrayList<Q> mTerms = new ArrayList<>();

    @Override
    public Q next() {
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
  }

  private final A003633Q mQSeq = new A003633Q();
  private int mN = -1;

  @Override
  public Z next() {
    return mQSeq.next().multiply(Z.ONE.shiftLeft(++mN)).toZ();
  }
}
