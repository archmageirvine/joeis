package irvine.oeis.a050;
// manually 2021-08-06

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050000 a(n) = floor(a(n-1)/2) if this is not among 0, a(1), ..., a(n-2); otherwise a(n) = 3*a(n-1).
 * @author Georg Fischer
 */
public class A050000 implements Sequence {

  protected final TreeSet<Z> mA; // remembers which terms are already in the sequence
  protected int mN; // current index n
  protected Z mPrev; // previous term a(n-1)

  protected int mParm1; // multiplicator for a(n-1)
  protected int mParm2; // divisor in floor()

  /** Construct the sequence. */
  public A050000() {
    this(3, 2);
  }

  /**
   * Generic constructor with parameter
   * @param parm1 multiplicator for a(n-1)
   * @param parm2 divisor in floor()
   */
  public A050000(final int parm1, final int parm2) {
    mParm1 = parm1;
    mParm2 = parm2;
    mN = 0;
    mA = new TreeSet<>();
    /* MMA:
      a[0] = 0; a[1] = 1; a[n_] := a[n] = (b = Floor[a[n-1]/2]; If[FreeQ[Table[ a[k], {k, 0, n-2}], b], b, 3*a[n-1]]);
    */
    mA.add(Z.ZERO);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      mPrev = Z.ONE;
      mA.add(mPrev);
      return mPrev;
    }
    Z result = mPrev.divide(mParm2);
    if (mA.contains(result)) {
      result = mPrev.multiply(mParm1);
    }
    mA.add(result);
    mPrev = result;
    return result;
  }
}
