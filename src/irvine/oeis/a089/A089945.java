package irvine.oeis.a089;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A089945 Main diagonal of array A089944, in which the n-th row is the n-th binomial transform of the natural numbers.
 * a(n) = (2*n+1)*(n+1)^(n-1).
 * @author Georg Fischer
 */
public class A089945 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : Z.valueOf(2 * mN + 1).multiply(Z.valueOf(mN + 1).pow(mN - 1));
  }
}
