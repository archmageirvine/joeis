package irvine.oeis.a194;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A194833 Rectangular array, by antidiagonals: row n gives the positions of n in the fractal sequence A194832; an interspersion.
 * @author Georg Fischer
 */
public class A194833 extends UpperLeftTriangle {

  private final MemorySequence mSeq;

  /** Construct the sequence. */
  public A194833() {
    this(1, new A194832());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   */
  public A194833(final int offset, final AbstractSequence seq) {
    super(offset, 1, 1, -1);
    mSeq = MemorySequence.cachedSequence(seq); // start at 0 though seq is 1-based
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    final int row = n + k - 1;
    final int start = row * (row - 1) / 2; // start of the relevant row in mSeq
    final int after = start + row; // behind that row
    final Z nz = Z.valueOf(n);
    Z result = Z.NEG_ONE; // assume not found
    int i = start;
//**System.out.print("# n=" + n + ", k=" + k + ", search " + n + " in row " + row + " = [" + start + ".." + String.valueOf(after - 1) + "]: ");
    while (i < after) { // search for n in the kth row
//**  System.out.print(mSeq.a(i) + ", ");
      if (mSeq.a(i).equals(nz)) {
        result = Z.valueOf(i + 1);
      }
      ++i;
    }
//**System.out.println("result=" + result);
    return result; // should not occur
  }

}
