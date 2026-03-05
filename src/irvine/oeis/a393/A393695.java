package irvine.oeis.a393;

import java.util.ArrayList;

import irvine.math.ContinuedFractionUtils;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a241.A241773;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393695 Number of decimal places which are known after using n terms of A241773 and treating them as the coefficients of a continued fraction.
 * @author Sean A. Irvine
 */
public class A393695 extends Sequence0 {

  private final Sequence mS = new A241773().prepend(0);
  private final ArrayList<Z> mCf = new ArrayList<>();

  @Override
  public Z next() {
    mCf.add(mS.next());
    if (mCf.size() <= 2) {
      return Z.ZERO;
    }
    final CR zLo = CR.valueOf(ContinuedFractionUtils.toQ(mCf));
    final Sequence cLo = new DecimalExpansionSequence(1, zLo);
    mCf.add(Z.ONE);
    final CR zHi = CR.valueOf(ContinuedFractionUtils.toQ(mCf));
    final Sequence cHi = new DecimalExpansionSequence(1, zHi);
    mCf.remove(mCf.size() - 1);
    long cnt = 1;
    while (true) {
      final Z lo = cLo.next();
      final Z hi = cHi.next();
      if (!lo.equals(hi)) {
        return Z.valueOf(cnt);
      }
      ++cnt;
    }
  }
}
