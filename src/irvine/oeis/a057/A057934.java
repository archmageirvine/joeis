package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057934 Number of prime factors of 10^n + 1 (counted with multiplicity).
 * @author Georg Fischer
 */
public class A057934 extends Sequence1 {

  private final int mBase;
  private Z mPow;
  private final int mAdd;

  /** Construct the sequence. */
  public A057934() {
    this(10, 1);
  }

  /**
   * Construct a sequence.
   * @param base base to work in
   * @param add additive term
   */
  public A057934(final int base, final int add) {
    mBase = base;
    mPow = Z.ONE;
    mAdd = add;
  }

  @Override
  public Z next() {
    mPow = mPow.multiply(mBase);
    return Z.valueOf(Jaguar.factor(mPow.add(mAdd)).bigOmega());
  }
}
