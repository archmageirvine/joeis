package irvine.math.group;

import irvine.math.api.Operation;
import irvine.math.api.Ring;
import irvine.math.api.Set;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * The ring comprising the direct sum of two other rings.
 * @author Sean A. Irvine
 * @param <T> Underlying type of first ring
 * @param <U> Underlying type of second ring
 */
public class DirectSum<T, U> extends DirectProduct<T, U> implements Ring<Pair<T, U>> {

  private final Ring<T> mFirst;
  private final Ring<U> mSecond;
  private final Pair<T, U> mOne;

  /**
   * Construct the ring direct product of the two given rings.
   * @param first first ring
   * @param second second ring
   */
  public DirectSum(final Ring<T> first, final Ring<U> second) {
    super(first, second);
    mFirst = first;
    mSecond = second;
    mOne = new Pair<>(first.one(), second.one());
  }

  @Override
  public Pair<T, U> one() {
    return mOne;
  }

  @Override
  public Pair<T, U> pow(final Pair<T, U> a, final long n) {
    return AbstractRing.pow(this, a, n);
  }

  @Override
  public Pair<T, U> multiply(final Pair<T, U> a, final Pair<T, U> b) {
    return new Pair<>(mFirst.multiply(a.left(), b.left()), mSecond.multiply(a.right(), b.right()));
  }

  @Override
  public Z ord(final Pair<T, U> element) {
    return AbstractRing.ord(this, element);
  }

  @Override
  public boolean isCommutative() {
    return mFirst.isCommutative() && mSecond.isCommutative();
  }

  @Override
  public boolean isIntegralDomain() {
    return (mFirst.isIntegralDomain() && Z.ONE.equals(mSecond.size()))
      || (mSecond.isIntegralDomain() && Z.ONE.equals(mFirst.size()));
  }

  @Override
  public Pair<T, U> isZeroDivisor(final Pair<T, U> element) {
    return AbstractRing.isZeroDivisor(this, element);
  }

  @Override
  public Z characteristic() {
    // todo -- improve this -- note finite characteristic in
    // subrings can lead to 0 characteristic here!
    return AbstractRing.characteristic(this);
  }

  @Override
  public boolean isSubring(final Set<Pair<T, U>> elements) {
    return AbstractRing.isSubring(this, elements);
  }

  @Override
  public boolean isIdeal(final Set<Pair<T, U>> elements) {
    return AbstractRing.isIdeal(this, elements);
  }

  @Override
  public Ring<Pair<T, U>> ideal(final Pair<T, U> element) {
    return new FiniteIdeal<>(this, element);
  }

  @Override
  public Ring<Set<Pair<T, U>>> quotientRing(final Ring<Pair<T, U>> ideal) {
    return new QuotientRing<>(this, ideal);
  }

  @Override
  public Operation<Pair<T, U>> multiplicativeOperation() {
    return new RingBackedOperation<>(this);
  }

}
