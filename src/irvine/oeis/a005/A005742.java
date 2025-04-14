package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005742 Number of degenerate fanout-free Boolean functions of n variables using And, Or, Not and Majority gates.
 * @author Sean A. Irvine
 */
public class A005742 extends Sequence1 {

  private final A005615 mSeq1 = new A005615();
  protected final ArrayList<Z> mTerms = new ArrayList<>();

  @Override
  public Z next() {
    mTerms.add(mSeq1.next());
    Z sum = Z.ZERO;
    for (int k = 0; k < mTerms.size(); ++k) {
      sum = sum.add(Binomial.binomial(mTerms.size(), k).multiply(mTerms.get(k)));
    }
    return sum;
  }

}

