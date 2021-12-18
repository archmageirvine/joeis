package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.ca.Cellular1DAutomaton;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A048710 Family 1 "Rule 90 x Rule 150 Array" read by antidiagonals.
 * @author Georg Fischer
 */
public class A048710 extends UpperLeftTriangle {

  protected int mN;
  protected MemorySequence mSeq;
  
  /** Construct the sequence. */
  public A048710() {
    super(0, 0, -1);
    mSeq = new MemorySequence() {
      private final Cellular1DAutomaton mCa = new Cellular1DAutomaton(150);
      @Override
      protected Z computeNext() {
        return mCa.nextStageD();
      }
    };
    mN = -1;
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    Z term = mSeq.a(n);
    for (int i = 0; i < k; ++i) {
      term = term.xor(term.multiply(4));
    }
    return term;
  }
}
