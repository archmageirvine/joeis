package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A110389 Integers with mutual residues -1.
 * Maple:
 * <pre>a:=proc(k, n::nonnegint) option remember;
 * if n&lt;3 then RETURN(n*k+1); fi;
 * if n=3 then RETURN(a(k, 1)*a(k, 2)-k); fi;
 * a(k, n-1)*(a(k, n-1)+k)-k; end;
 * seq(a(4, n), n=1..9);
 * </pre>
 * @author Georg Fischer
 */
public class A110389 extends Sequence1 {

  protected int mN;
  protected int mK;
  protected Z mAm1;

  /** Construct the sequence. */
  public A110389() {
    this(1);
  }

  /**
   * Generic constructor with parameters
   * @param k formula parameter
   */
  public A110389(final int k) {
    mK = k;
    mAm1 = Z.valueOf(mK + 1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN < 3) {
      mAm1 = Z.valueOf(mN * mK + 1);
    } else if (mN == 3) {
      mAm1 = Z.valueOf((mK + 1) * (2 * mK + 1) - mK);
    } else {
      mAm1 = mAm1.multiply(mAm1.add(mK)).subtract(mK);
    }
    return mAm1;
  }
}
