package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000364 Euler (or secant or "Zig") numbers: e.g.f. (even powers only) sec(x) = 1/cos(x).
 * @author Sean A. Irvine
 */
public class A000364 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000364(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000364() {
    super(0);
  }

  // Euler or secant numbers

  protected final ArrayList<Z> mA364 = new ArrayList<>();
  protected int mN = -1;

  @Override
  public Z next() {
    // Use recurrence due to Ralf Stephan
    if (++mN == 0) {
      mA364.add(Z.ONE);
      return Z.ONE;
    }
    Z t = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      final Z z = Binomial.binomial(2L * mN, 2L * k).multiply(mA364.get(k));
      t = t.signedAdd((k & 1) == 0, z);
    }
    if ((mN & 1) == 0) {
      t = t.negate();
    }
    mA364.add(t);
    return t;
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    return n == 0 ? Z.ONE : Rationals.SINGLETON.sum(1, 2 * n, k -> Rationals.SINGLETON.sum(0, k - 1,
      i -> new Q(Z.valueOf(i - k).pow(2 * n).multiply(Binomial.binomial(2 * k, i)).multiply(Z.NEG_ONE.pow(i + k + n)), Z.TWO.pow(k - 1)))).num();
  }

}
