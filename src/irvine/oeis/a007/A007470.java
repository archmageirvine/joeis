package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Stirling2TransformSequence;

/**
 * A007470 Shifts left when <code>Stirling-2</code> transform applied twice.
 * @author Sean A. Irvine
 */
public class A007470 extends MemorySequence {

  private class InnerSequence extends MemorySequence {
    @Override
    protected Z computeNext() {
      return isEmpty() ? Z.ONE : Stirling2TransformSequence.stirling2(A007470.this);
    }
  }

  private final InnerSequence mInnerSequence = new InnerSequence();

  @Override
  protected Z computeNext() {
    mInnerSequence.next();
    if (isEmpty()) {
      add(Z.ONE);
      return Z.ONE;
    } else {
      return Stirling2TransformSequence.stirling2(mInnerSequence);
    }
  }
}
