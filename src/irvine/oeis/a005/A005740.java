package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005740 Number of fanout-free Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A005740 extends AbstractSequence {

  private final A005617 mSeq1 = new A005617();

  /** Construct the sequence. */
  public A005740() {
    super(1);
  }

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

