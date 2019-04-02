package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.BinomialTransformSequence;
import irvine.oeis.MemorySequence;

/**
 * A007472 Shifts 2 places left when binomial transform applied twice.
 * @author Sean A. Irvine
 */
public class A007472 extends MemorySequence {

  private final ArrayList<Z> mInner = new ArrayList<>();
  {
    mInner.add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    if (size() < 2) {
      return Z.ONE;
    } else {
      mInner.add(BinomialTransformSequence.binomial(this, size()));
      return BinomialTransformSequence.binomial(mInner, mInner.size() - 1);
    }
  }
}
