package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A005738.
 * @author Sean A. Irvine
 */
public class A005738 extends A005616 {

  protected final ArrayList<Z> mTerms = new ArrayList<>();

  @Override
  public Z next() {
    mTerms.add(super.next());
    Z sum = Z.ZERO;
    for (int k = 0; k < mTerms.size(); ++k) {
      sum = sum.add(Binomial.binomial(mTerms.size(), k).multiply(mTerms.get(k)));
    }
    return sum;
  }

}

