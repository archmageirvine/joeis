package irvine.oeis.a341;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A341277 Number of length-n binary mesosome-avoiding strings.
 * @author Georg Fischer
 */
public class A341277 extends Sequence0 {

  private int mN = -1;
  private static final int[] INITS = {1, 2, 4, 8, 14};

  @Override
  public Z next() {
    ++mN;
    if (mN <= 4) {
      return Z.valueOf(INITS[mN]);
    }
/*
    final int n = mN / 4;
    final long nnn2 = 2*n*n*n;
    final long nn3 = 3*n*n;
    // System.out.println("mod=" + (mN % 4) + ", mN=" + mN + ", n=" + n + ", nnn2=" + nnn2 + ", nn3=" + nn3);
    switch (mN % 4) {
      default:
      case 0: // a(4n  ) = 2n^3/3 - 3n^2/2 + 5n/6 = (2*2n^3 - 3*3n^2 + 5n)/6
        return Z.valueOf(2*nnn2 - 3*nn3 + 5*n).divide(6);
      case 1: // a(4n+1) = 2n^3/3 - n^2 + n/3     = (2n^3 - 3*n^2 + n)/3
        return Z.valueOf(nnn2 - nn3 + n).divide(3);
      case 2: // a(4n+2) = 2n^3/3 - n^2/2 - n/6   = (2*2n^3 - 3*n^2 - n)/6
        return Z.valueOf(2*nnn2 - nn3 - n).divide(6);
      case 3: // a(4n+3) = 2n^3/3 - 2n/3          = (2n^3 - 2n)/3
        return Z.valueOf(nnn2 - 2*n).divide(3);
    }
*/
    final int k = mN / 4;
    int result = 4 * k * k * k;
    switch (mN % 4) { // Theorem 2, eqn. (1)
      case 0: // m(4k    ) = (4k^3 + 15k^2 + 41k - 12)/3;
        result += 15 * k * k + 41 * k - 12;
        break;
      case 1: // m(4k + 1) = (4k^3 + 18k^2 + 50k     )/3;
        result += 18 * k * k + 50 * k;
        break;
      case 2: // m(4k + 2) = (4k^3 + 21k^2 + 59k + 12)/3;
        result += 21 * k * k + 59 * k + 12;
        break;
      case 3: // m(4k + 3) = (4k^3 + 24k^2 + 68k + 30)/3.
      default:
        result += 24 * k * k + 68 * k + 30;
        break;
    }
    return Z.valueOf(result / 3);
  }
}
