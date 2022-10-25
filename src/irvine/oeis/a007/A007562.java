package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.EulerTransformSequence;

/**
 * A007562 Number of planted trees where non-root, non-leaf nodes an even distance from root are of degree 2.
 * @author Sean A. Irvine
 */
public class A007562 extends MemorySequence {

  private final ArrayList<Z> mInner = new ArrayList<>();
  {
    setOffset(1);
    mInner.add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    if (size() < 1) {
      return Z.ONE;
    } else {
      mInner.add(EulerTransformSequence.eulerTransform(toList(), size() - 1));
      return EulerTransformSequence.eulerTransform(mInner, mInner.size() - 2);
    }
  }
}
