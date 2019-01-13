package irvine.math.group;

import java.util.Iterator;
import java.util.Random;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.util.AbstractIterator;

/**
 * Ring of integers under addition modulo <code>n</code>.
 * @author Sean A. Irvine
 */
public class IntegersMod extends AbstractRing<Z> {

  private final Z mMod;
  private final Z mOne;

  /**
   * Construct a new ring with given modulus.
   * @param modulus the modulus
   */
  public IntegersMod(final Z modulus) {
    if (modulus.signum() < 1) {
      throw new IllegalArgumentException();
    }
    mMod = modulus;
    mOne = Z.ONE.mod(mMod);
  }

  /**
   * Construct a new ring with given modulus.
   * @param modulus the modulus
   */
  public IntegersMod(final long modulus) {
    this(Z.valueOf(modulus));
  }

  @Override
  public Z zero() {
    return Z.ZERO;
  }

  @Override
  public Z one() {
    return mOne;
  }

  @Override
  public Z add(final Z a, final Z b) {
    return a.add(b).mod(mMod);
  }

  @Override
  public Z subtract(final Z a, final Z b) {
    return a.subtract(b).mod(mMod);
  }

  @Override
  public Z multiply(final Z a, final Z b) {
    return a.modMultiply(b, mMod);
  }

  @Override
  public Z pow(final Z a, final long n) {
    if (n > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    return a.modPow(Z.valueOf(n), mMod);
  }

  @Override
  public Z negate(final Z a) {
    return a.negate().add(mMod).mod(mMod);
  }

  @Override
  public Z size() {
    return mMod;
  }

  @Override
  public boolean contains(final Z element) {
    return element != null && element.signum() >= 0 && element.compareTo(mMod) < 0;
  }

  private static final class IntegerIterator extends AbstractIterator<Z> {

    private final Z mLimit;
    private Z mN = Z.NEG_ONE;

    private IntegerIterator(final Z mod) {
      mLimit = mod.subtract(1);
    }

    @Override
    public boolean hasNext() {
      return mN.compareTo(mLimit) < 0;
    }

    @Override
    public Z next() {
      mN = mN.add(1);
      return mN;
    }
  }

  @Override
  public Iterator<Z> iterator() {
    return new IntegerIterator(mMod);
  }

  @Override
  public boolean isCommutative() {
    return true;
  }

  @Override
  public boolean isIntegralDomain() {
    return mMod.isPrime();
  }

  @Override
  public boolean isCyclic() {
    return true;
  }

  @Override
  public String toString() {
    return "\\Z(" + mMod + ")";
  }

  @Override
  public Z characteristic() {
    return mMod;
  }

  @Override
  public Z coerce(final long n) {
    return Z.valueOf(n).mod(mMod);
  }

  @Override
  public Z random(final Random random) {
    return ZUtils.random(random, size());
  }
}
