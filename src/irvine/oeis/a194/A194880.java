package irvine.oeis.a194;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A194880 The numerators of the inverse Akiyama-Tanigawa algorithm from A001045(n).
 * @author Georg Fischer
 */
public class A194880 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    // a(3*n)=-3*n-1 except a(0)=0; a(3*n+1)=-3*n-2 except a(1)=-1; a(3*n+2)=-n-1.
    ++mN;
    if (mN <= 1) {
      return Z.valueOf(mN).negate();
    }
    final int n = mN / 3;
    switch (mN % 3) {
      case 0:
        return Z.valueOf(-3 * n - 1);
      case 1:
        return Z.valueOf(-3 * n - 2);
      case 2:
        return Z.valueOf(-n - 1);
      default:
        throw new RuntimeException();
    }
  }
}
