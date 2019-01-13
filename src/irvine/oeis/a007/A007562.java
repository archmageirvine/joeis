package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.MemorySequence;

/**
 * A007562.
 * @author Sean A. Irvine
 */
public class A007562 extends MemorySequence {

  private final ArrayList<Z> mInner = new ArrayList<>();
  {
    mInner.add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    if (size() < 1) {
      return Z.ONE;
    } else {
      mInner.add(EulerTransformSequence.eulerTransform(this, size() - 1));
      return EulerTransformSequence.eulerTransform(mInner, mInner.size() - 2);
    }
  }
}
