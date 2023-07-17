package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000275 Coefficients of a Bessel function (reciprocal of J_0(z)); also pairs of permutations with rise/rise forbidden.
 * @author Sean A. Irvine
 */
public class A000275 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000275(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000275() {
    super(0);
  }

  protected int mN = -1;
  protected final ArrayList<Z> mA = new ArrayList<>();

  @Override
  public Z next() {
    final Z res;
    if (++mN == 0) {
      res = Z.ONE;
    } else {
      Z t = Z.ZERO;
      for (int r = 0; r < mN; ++r) {
        final Z z = Binomial.binomial(mN, r).square().multiply(mA.get(r));
        t = t.signedAdd(((r + mN) & 1) != 0, z);
      }
      res = t;
    }
    mA.add(res);
    return res;
  }
}
