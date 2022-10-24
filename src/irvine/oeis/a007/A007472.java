package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A007472 Shifts 2 places left when binomial transform is applied twice.
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
      mInner.add(BinomialTransformSequence.binomial(toList(), size()));
      return BinomialTransformSequence.binomial(mInner, mInner.size() - 1);
    }
  }
}
