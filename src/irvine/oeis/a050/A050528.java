package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A050528 Primes of the form 9*2^n+1.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A050528 extends AbstractSequence {

  private final int mBase;
  private final int mAdd;
  private Z mM;

  /** Construct the sequence. */
  public A050528() {
    this(1, 9, 2, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param mult multiplicative parameter
   * @param base number base
   * @param add additive parameter
   */
  public A050528(final int offset, final int mult, final int base, final int add) {
    super(offset);
    mBase = base;
    mAdd = add;
    mM = Z.valueOf(mult);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mM.add(mAdd);
      mM = mM.multiply(mBase);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
