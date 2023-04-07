package irvine.oeis.a284;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A284150 Sum_{d|n, d==1 or 4 mod 5} d.
 * @author Georg Fischer
 */
public class A284150 extends AbstractSequence {

  private int mN;
  private final int[] mResidues;
  private final int mModulus;

  /** Construct the sequence. */
  public A284150() {
    this(1, 5, 1, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param modulus modulus for sequence
   * @param residues list of residues
   */
  public A284150(final int offset, final int modulus, final int... residues) {
    super(offset);
    mN = offset - 1;
    mModulus = modulus;
    mResidues = new int[residues.length];
    for (int i = 0; i < residues.length; ++i) {
      mResidues[i] = residues[i];
    }
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      final int dmod = d.intValue() % mModulus;
      for (int i = 0; i < mResidues.length; ++i) {
        if (dmod == mResidues[i]) {
          sum = sum.add(d);
        }
      }
    }
    return sum;
  }
}
