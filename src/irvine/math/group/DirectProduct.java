package irvine.math.group;

import java.util.Iterator;
import java.util.Random;

import irvine.math.api.Group;
import irvine.math.set.CartesianProduct;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * The group comprising the direct product of two other groups.
 * @author Sean A. Irvine
 * @param <T> Underlying type of first group
 * @param <U> Underlying type of second group
 */
public class DirectProduct<T, U> extends AbstractGroup<Pair<T, U>> {

  private final Group<T> mFirst;
  private final Group<U> mSecond;
  private final Pair<T, U> mZero;

  /**
   * Construct the group direct product of the two given groups.
   * @param first first group
   * @param second second group
   */
  public DirectProduct(final Group<T> first, final Group<U> second) {
    if (first == null || second == null) {
      throw new NullPointerException();
    }
    mFirst = first;
    mSecond = second;
    mZero = new Pair<>(mFirst.zero(), mSecond.zero());
  }

  @Override
  public Pair<T, U> zero() {
    return mZero;
  }

  @Override
  public Z size() {
    final Z aSize = mFirst.size();
    if (aSize == null) {
      return null;
    }
    final Z bSize = mSecond.size();
    if (bSize == null) {
      return null;
    }
    return aSize.multiply(bSize);
  }

  @Override
  public boolean isAbelian() {
    return mFirst.isAbelian() && mSecond.isAbelian();
  }

  @Override
  public boolean contains(final Pair<T, U> a) {
    return mFirst.contains(a.left()) && mSecond.contains(a.right());
  }

  @Override
  public Pair<T, U> add(final Pair<T, U> a, final Pair<T, U> b) {
    checkContains(a);
    checkContains(b);
    final T alpha = mFirst.add(a.left(), b.left());
    final U beta = mSecond.add(a.right(), b.right());
    return new Pair<>(alpha, beta);
  }

  @Override
  public Pair<T, U> negate(final Pair<T, U> a) {
    checkContains(a);
    return new Pair<>(mFirst.negate(a.left()), mSecond.negate(a.right()));
  }

  @Override
  public Z order(final Pair<T, U> element) {
    checkContains(element);
    final Z ordLeft = mFirst.order(element.left());
    if (ordLeft == null) {
      return null;
    }
    final Z ordRight = mSecond.order(element.right());
    if (ordRight == null) {
      return null;
    }
    return ordLeft.lcm(ordRight);
  }

  @Override
  public Z exponent() {
    final Z e1 = mFirst.exponent();
    if (e1 == null) {
      return null;
    }
    final Z e2 = mSecond.exponent();
    if (e2 == null) {
      return null;
    }
    return e1.lcm(e2);
  }

  @Override
  public Iterator<Pair<T, U>> iterator() {
    return new CartesianProduct<>(mFirst, mSecond).iterator();
  }

  @Override
  public Pair<T, U> random(final Random random) {
    return new Pair<>(mFirst.random(random), mSecond.random(random));
  }

  @Override
  public String toString() {
    return mFirst + "\\times" + mSecond;
  }
}
