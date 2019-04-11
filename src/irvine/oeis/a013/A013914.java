package irvine.oeis.a013;

import java.util.HashSet;
import java.util.Set;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013914 Number of distinct nonzero absolute values of Sum_{j=1..n} sigma_j * exp(i * Pi <code>* j / n)</code> where sigma_j <code>= +- 1</code>.
 * @author Sean A. Irvine
 */
public class A013914 implements Sequence {

  private static final int DIGITS_ACCURACY = 50; // should be plenty
  private static final ComputableComplexField CCF = ComputableComplexField.SINGLETON;

  private int mN = 0;
  private final Set<String> mTerms = new HashSet<>();
  private CC[] mRoots = null;

  private void search(final CC sum, final int j) {
    if (j == mN) {
      // Use base 16 for simpler scaling down deep
      mTerms.add(CCF.abs(sum).toString(DIGITS_ACCURACY, 16));
      return;
    }
    search(CCF.add(sum, mRoots[j]), j + 1);
    search(CCF.subtract(sum, mRoots[j]), j + 1);
  }

  @Override
  public Z next() {
    if (++mN < 1) {
      return Z.ONE;
    }
    mTerms.clear();
    final CC[] roots = new CC[mN];
    for (int k = 0; k < roots.length; ++k) {
      roots[k] = CCF.exp(CCF.multiply(CCF.multiply(CC.I, CR.PI), CR.valueOf(new Q(k + 1, mN))));
    }
    mRoots = roots;
    search(CC.ZERO, 0);
    mTerms.remove(CR.ZERO.toString(DIGITS_ACCURACY, 16));
    //System.out.println(mTerms);
    return Z.valueOf(mTerms.size());
  }
}
