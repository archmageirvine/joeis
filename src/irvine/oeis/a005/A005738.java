package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005738 Number of degenerate fanout-free Boolean functions of n variables using And, Or, Xor, and Not gates.
 * @author Sean A. Irvine
 */
public class A005738 extends Sequence0 {

  private final A005616 mSeq1 = new A005616();
  private boolean mFirst = true;
  protected final ArrayList<Z> mTerms = new ArrayList<>();

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    mTerms.add(mSeq1.next());
    Z sum = Z.ZERO;
    for (int k = 0; k < mTerms.size(); ++k) {
      sum = sum.add(Binomial.binomial(mTerms.size(), k).multiply(mTerms.get(k)));
    }
    return sum;
  }
}

