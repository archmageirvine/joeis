package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.MobiusTransformSequence;

/**
 * A007551 Shifts left when Moebius transformation applied twice.
 * @author Sean A. Irvine
 */
public class A007551 extends MemorySequence {

  private final ArrayList<Z> mInner = new ArrayList<>();
  {
    mInner.add(Z.ONE);
    add(Z.ONE);
  }

  @Override
  protected Z computeNext() {
    if (size() < 2) {
      return Z.ONE;
    } else {
      mInner.add(MobiusTransformSequence.mobiusTransform(this));
      return MobiusTransformSequence.mobiusTransform(mInner);
    }
  }
}
