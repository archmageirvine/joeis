package irvine.oeis.a392;

import java.util.ArrayList;

import irvine.math.ContinuedFractionUtils;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001622;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392060 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A392060 extends Sequence1 {

  private final ArrayList<Z> mCf = new ArrayList<>();

  @Override
  public Z next() {
    mCf.add(Z.ONE);
    System.out.println("n=" + mCf.size());
    System.out.println(CR.valueOf(ContinuedFractionUtils.toQ(mCf)).toString(20));
    System.out.println(CR.PHI.toString(20));
    final Sequence v = new DecimalExpansionSequence(CR.valueOf(ContinuedFractionUtils.toQ(mCf)));
    //final Sequence v = new DecimalExpansionFromContinuedFractionSequence(new FiniteSequence(mCf));
    final Sequence phi = new A001622();
    long cnt = 0;
    while (phi.next().equals(v.next())) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
