package irvine.math.padic;

import java.util.Iterator;

import irvine.math.group.AbstractField;
import irvine.math.z.Z;

/**
 * Field of rationals under addition and multiplication.
 * @author Sean A. Irvine
 */
public final class PAdicField extends AbstractField<PAdic> {

  private final long mP;
  private final PAdic mZero;
  private final PAdic mOne;

  /**
   * Construct the p-adic field for a given prime.
   * @param p prime
   */
  public PAdicField(final long p) {
    mP = p;
    mZero = PAdic.create(p);
    mOne = PAdic.create(p, 1);
  }

  /**
   * Get the prime associated with this field.
   * @return prime
   */
  public long p() {
    return mP;
  }

  @Override
  public PAdic zero() {
    return mZero;
  }

  @Override
  public PAdic one() {
    return mOne;
  }

  @Override
  public PAdic add(final PAdic a, final PAdic b) {
    return new Add(a, b);
  }

  @Override
  public PAdic multiply(final PAdic a, final PAdic b) {
    return Mul.multiply(a, b);
  }

  @Override
  public PAdic negate(final PAdic a) {
    return new Negate(a);
  }

  @Override
  public PAdic inverse(final PAdic a) {
    throw new UnsupportedOperationException();
//    return a.reciprocal();
  }

  @Override
  public Z size() {
    return null;
  }

  @Override
  public boolean contains(final PAdic element) {
    return element != null && element.p() == p();
  }

  @Override
  public Iterator<PAdic> iterator() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isCyclic() {
    return false;
  }

  @Override
  public String toString() {
    return "\\Q_{" + p() + "}";
  }

  @Override
  public Z characteristic() {
    return Z.ZERO;
  }

  @Override
  public PAdic coerce(final long n) {
    return PAdic.create(p(), n);
  }
}
