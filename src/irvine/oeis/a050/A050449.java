package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A050449 a(n) = Sum_{d|n, d == 1 (mod 4)} d.
 * @author Georg Fischer
 */
public class A050449 extends AbstractSequence {

  private int mN;
  private final int mResidue;
  private final int mModulus;

  /** Construct the sequence. */
  public A050449() {
    this(1, 1, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param residue residue for sequence
   * @param modulus modulus for sequence
   */
  public A050449(final int offset, final int residue, final int modulus) {
    super(offset);
    mN = offset - 1;
    mResidue = residue;
    mModulus = modulus;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.mod(mModulus) == mResidue) {
        sum = sum.add(d);
      }
    }
    return sum;
  }
}
