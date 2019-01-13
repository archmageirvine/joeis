package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.MemorySequence;

/**
 * A007563.
 * @author Sean A. Irvine
 */
public class A007563 extends MemorySequence {

  // I'm not sure why I get interspersed zeros here

  private final ArrayList<Z> mInner = new ArrayList<>();
  private boolean mFirst = true;

  @Override
  protected Z computeNext() {
    if (size() < 1) {
      return Z.ZERO;
    } else {
      mInner.add(EulerTransformSequence.eulerTransform(this, size()));
      return EulerTransformSequence.eulerTransform(mInner, mInner.size() - 1);
    }
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    // Effectively drop every second term which is 0
    super.next();
    return super.next();
  }
}
