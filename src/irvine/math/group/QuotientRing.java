package irvine.math.group;

import irvine.math.api.Operation;
import irvine.math.api.Ring;
import irvine.math.api.Set;
import irvine.math.z.Z;

/**
 * A quotient ring.
 * @author Sean A. Irvine
 * @param <T> Underlying type
 */
public class QuotientRing<T> extends DefaultQuotientGroup<T> implements Ring<Set<T>> {

  private final Ring<T> mParent;
  private final Ring<T> mIdeal;

  /**
   * Construct a new quotient of the parent ring using the given ideal.
   * The supplied ideal is assumed to be valid.
   * @param parent parent ring
   * @param ideal the ideal
   * @exception NullPointerException if either ring is null.
   */
  QuotientRing(final Ring<T> parent, final Ring<T> ideal) {
    super(parent, ideal);
    mParent = parent;
    mIdeal = ideal;
  }

  @Override
  public Set<T> multiply(final Set<T> a, final Set<T> b) {
    // Get representative elements
    final T aa = a.iterator().next();
    final T bb = b.iterator().next();
    return mParent.rightCoset(mIdeal, mParent.multiply(aa, bb));
  }

  @Override
  public Set<T> isZeroDivisor(final Set<T> element) {
    return AbstractRing.isZeroDivisor(this, element);
  }

  @Override
  public Z characteristic() {
    // todo -- improve this -- note finite characteristic in
    // subrings can lead to 0 characteristic here!
    return AbstractRing.characteristic(this);
  }

  @Override
  public boolean isSubring(final Set<Set<T>> elements) {
    return AbstractRing.isSubring(this, elements);
  }

  @Override
  public boolean isIdeal(final Set<Set<T>> elements) {
    return AbstractRing.isIdeal(this, elements);
  }

  @Override
  public Ring<Set<T>> ideal(final Set<T> element) {
    return new FiniteIdeal<>(this, element);
  }

  @Override
  public Set<T> one() {
    return mParent.rightCoset(mIdeal, mParent.one());
  }

  @Override
  public Set<T> pow(final Set<T> a, final long n) {
    return AbstractRing.pow(this, a, n);
  }

  @Override
  public Z ord(final Set<T> element) {
    return AbstractRing.ord(this, element);
  }

  @Override
  public boolean isCommutative() {
    return mParent.isCommutative();
  }

  @Override
  public boolean isIntegralDomain() {
    return AbstractRing.isIntegralDomain(this);
  }

  @Override
  public Ring<Set<Set<T>>> quotientRing(final Ring<Set<T>> ideal) {
    return new QuotientRing<>(this, ideal);
  }

  @Override
  public Operation<Set<T>> multiplicativeOperation() {
    return new RingBackedOperation<>(this);
  }
}
