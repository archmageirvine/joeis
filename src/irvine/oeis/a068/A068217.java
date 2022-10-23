package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068217 Denominators of coefficients in 3*log(sqrt(1+x)) power series.
 * a(n) = 2*n/3 if n==0 (mod 3), a(n) = 2*n
 * @author Georg Fischer
 */
public class A068217 extends Sequence1 {

  protected long mN;
  
  /** Construct the sequence. */
  public A068217() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mN % 3 == 0 ? Z.valueOf(2 * mN / 3) : Z.valueOf(2 * mN);
  }
}
