package irvine.oeis.a032;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032452 Irregular triangle read by rows: row <code>n &gt;= 1</code> contains the sequence <code>p(n), s(p(n)), p(s(p(n))), p(p(s(p(n)))), s(p(p(s(p(n)))))</code>, ..., repeatedy applying <code>(p,s,p)</code> to n, where p = phi <code>(A000010), s =</code> sigma <code>= (A000203)</code>, stopping after the first 1 is reached. If 1 is never reached, row n contains -1.
 * @author Sean A. Irvine
 */
public class A032452 implements Sequence {

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
        final FactorSequence fs = Cheetah.factor(t);
        t = (mNextTerms.size() % 3) == 1 ? fs.sigma() : fs.phi();
        mNextTerms.add(t);
      } while (!Z.ONE.equals(t));
    }
    return mNextTerms.get(mM);
  }
}
