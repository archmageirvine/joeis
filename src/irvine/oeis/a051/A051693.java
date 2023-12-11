package irvine.oeis.a051;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.PairSumSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A051693 Square array read by antidiagonals: a(n,k) = sum of two positive regular n-polytopic numbers (i.e., a(n,k) = binomial(x,n) + binomial(y,n) for some x,y &gt;= n).
 * @author Sean A. Irvine
 */
public class A051693 extends Sequence1 {

  private static final class NGonalSequence extends Sequence1 {
    private final long mM;
    private long mN;

    private NGonalSequence(final long m) {
      mM = m;
      mN = m - 1;
    }

    @Override
    public Z next() {
      return Binomial.binomial(++mN, mM);
    }
  }

  private final List<MemorySequence> mL = new ArrayList<>();
  {
    mL.add(null);
  }
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mL.add(MemorySequence.cachedSequence(new PairSumSequence(new NGonalSequence(++mN))));
      mM = 0;
    }
    return mL.get(mN - mM).a(mM);
  }
}
