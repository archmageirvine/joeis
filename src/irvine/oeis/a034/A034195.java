package irvine.oeis.a034;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.WreathExponentiation;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034195 Number of binary codes of length 10 with n words.
 * @author Sean A. Irvine
 */
public class A034195 extends Sequence0 {

  private final int mBase;
  private final int mLength;
  private Polynomial<Q> mA = null;
  private int mN = -1;

  protected A034195(final int base, final int length) {
    mBase = base;
    mLength = length;
  }

  /** Construct the sequence. */
  public A034195() {
    this(2, 10);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = WreathExponentiation.exponentiation(SymmetricGroup.create(mBase).cycleIndex(), SymmetricGroup.create(mLength).cycleIndex()).applyOnePlusXToTheN();
    }
    final Z r = mA.coeff(++mN).toZ();
    return r.isZero() ? null : r;
  }
}

