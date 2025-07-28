package irvine.oeis.a386;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.Sequence1;
import irvine.oeis.UnionSequence;

/**
 * A386214 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A386214 extends Sequence1 {

  private int mR = -1;
  private final ArrayList<Sequence> mRows = new ArrayList<>();

  private static final class FSequence extends Sequence0 {

    private final long mM;
    private final long mK;
    private int mN = -1;

    private FSequence(final long k, final long m) {
      mK = k;
      mM = m;
    }

    @Override
    public Z next() {
      return Functions.FIBONACCI.z(++mN).multiply(mM).add(Functions.FIBONACCI.z(mN - 1)).multiply(mK);
    }
  }

  @Override
  public Z next() {
    if (++mR >= mRows.size()) {
      final Sequence[] union = new Sequence[mR + 1];
      for (int k = 0; k < union.length; ++k) {
        union[k] = new FSequence(k + 1, mR + 2);
      }
      mRows.add(UnionSequence.createUnion(union));
      mR = 0;
    }
    return mRows.get(mR).next();
  }
}
