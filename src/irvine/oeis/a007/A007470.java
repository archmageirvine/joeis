package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.transform.Stirling2TransformSequence;

/**
 * A007470 Shifts left when Stirling2 transform is applied twice.
 * @author Sean A. Irvine
 */
public class A007470 extends MemorySequence {

  {
    setOffset(1);
  }

  private class InnerSequence extends MemorySequence {

  {
    setOffset(1);
  }
    @Override
    protected Z computeNext() {
      return size() == 0 ? Z.ONE : Stirling2TransformSequence.stirling2(A007470.this.toList());
    }
  }

  private final InnerSequence mInnerSequence = new InnerSequence();

  @Override
  protected Z computeNext() {
    mInnerSequence.next();
    if (size() == 0) {
      add(Z.ONE);
      return Z.ONE;
    } else {
      return Stirling2TransformSequence.stirling2(mInnerSequence.toList());
    }
  }
}
