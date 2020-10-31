package irvine.math.group;

import java.util.Iterator;

import irvine.math.api.Group;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.util.AbstractIterator;

/**
 * Group of integers under multiplication modulo <code>n</code>.
 * @author Sean A. Irvine
 */
public class IntegersModMul extends AbstractGroup<Z> {

  private final Z mMod;

  /**
   * Construct a new ring with given modulus.
   * @param modulus the modulus
   */
  public IntegersModMul(final Z modulus) {
    if (modulus.compareTo(Z.ONE) < 0) {
      throw new IllegalArgumentException();
    }
    mMod = modulus;
  }

  /**
   * Construct a new ring with given modulus.
   * @param modulus the modulus
   */
  public IntegersModMul(final long modulus) {
    this(Z.valueOf(modulus));
  }

  @Override
  public Z zero() {
    return Z.ONE;
  }

  @Override
  public Z add(final Z a, final Z b) {
    return a.modMultiply(b, mMod);
  }

  @Override
  public Z negate(final Z a) {
    return a.modInverse(mMod);
  }

  @Override
  public Z size() {
    return Euler.phi(mMod);
  }

  @Override
  public boolean contains(final Z element) {
    return element != null && Z.ONE.equals(mMod.gcd(element));
  }

  private static final class IntegerIterator extends AbstractIterator<Z> {

    private final Z mSize;
    private final Z mMod;
    private Z mN = Z.ZERO;
    private Z mOutput = Z.ZERO;

    private IntegerIterator(final Z mod, final Z size) {
      mSize = size;
      mMod = mod;
    }

    @Override
    public boolean hasNext() {
      return mOutput.compareTo(mSize) < 0;
    }

    @Override
    public Z next() {
      do {
        mN = mN.add(1);
      } while (!mMod.gcd(mN).equals(Z.ONE));
      mOutput = mOutput.add(1);
      return mN;
    }
  }

  @Override
  public Iterator<Z> iterator() {
    return new IntegerIterator(mMod, size());
  }

  @Override
  public boolean isAbelian() {
    return true;
  }

  @Override
  public boolean isIsomorphic(final Group<?> group) {
    if (group instanceof IntegersModMul) {
      return ShanksPhi.phi(mMod).equals(ShanksPhi.phi(((IntegersModMul) group).mMod));
    }
    return super.isIsomorphic(group);
  }

  @Override
  public String toString() {
    return "\\Z_{(" + mMod + ")}";
  }
}
