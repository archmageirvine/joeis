package irvine.oeis.a032;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032452 Irregular triangle read by rows: row n &gt;= 1 contains the sequence p(n), s(p(n)), p(s(p(n))), p(p(s(p(n)))), s(p(p(s(p(n))))), ..., repeatedly applying (p,s,p) to n, where p = phi (A000010), s = sigma = (A000203), stopping after the first 1 is reached. If 1 is never reached, row n contains -1.
 * @author Sean A. Irvine
 */
public class A032452 extends Sequence1 {

  private final List<Z> mNextTerms = new ArrayList<>();
  private long mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mNextTerms.size()) {
      mNextTerms.clear();
      mM = 0;
      Z t = Z.valueOf(++mN);
      do {
        final FactorSequence fs = Jaguar.factor(t);
        t = (mNextTerms.size() % 3) == 1 ? fs.sigma() : fs.phi();
        mNextTerms.add(t);
      } while (!Z.ONE.equals(t));
    }
    return mNextTerms.get(mM);
  }
}
