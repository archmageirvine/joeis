package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A005736 Number of degenerate fanout-free Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A005736 extends A005640 {

  private boolean mFirst = true;
  protected final ArrayList<Z> mTerms = new ArrayList<>();
  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    mTerms.add(mTerms.isEmpty() ? Z.TWO : super.next());
    Z sum = Z.ZERO;
    for (int k = 0; k < mTerms.size(); ++k) {
      sum = sum.add(Binomial.binomial(mTerms.size(), k).multiply(mTerms.get(k)));
    }
    return sum;
  }

}

