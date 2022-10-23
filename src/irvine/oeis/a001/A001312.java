package irvine.oeis.a001;

import java.util.Arrays;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001312 Number of ways of making change for n cents using coins of 1, 2, 5, 10, 50, 100 cents.
 * @author Sean A. Irvine
 */
public class A001312 extends Sequence0 {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final int[] mCoins;
  private int mM = 0;
  private int mN = -1;
  private Polynomial<Z> mDen = RING.one();

  protected A001312(final int... coins) {
    mCoins = Arrays.copyOf(coins, coins.length);
  }

  /** Construct the sequence. */
  public A001312() {
    this(1, 2, 5, 10, 50, 100);
  }

  @Override
  public Z next() {
    ++mN;
    while (mM < mCoins.length && mN >= mCoins[mM]) {
      mDen = RING.multiply(mDen, RING.oneMinusXToTheN(mCoins[mM++]));
    }
    return RING.coeff(RING.one(), mDen, mN);
  }
}
