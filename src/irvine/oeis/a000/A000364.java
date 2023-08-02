package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000364 Euler (or secant or "Zig") numbers: e.g.f. (even powers only) sec(x) = 1/cos(x).
 * @author Sean A. Irvine
 */
public class A000364 extends AbstractSequence {

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
}
