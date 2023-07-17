package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a024.A024996;

/**
 * A026077 a(n) = T(2n,n+1), where T is the array defined in A024996.
 * @author Sean A. Irvine
 */
public class A026077 extends A024996 {

  /** Construct the sequence. */
  public A026077() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return get(2 * mN, mN + 1);
  }
}

