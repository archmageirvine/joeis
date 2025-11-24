package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A082082 Number of steps to reach 1 in the process of expanding the interval (i1,i2) successively to right and left, such that i1 and i2 always stay coprime, starting with (n,n).
 * @author Sean A. Irvine
 */
public class A082082 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long lo = ++mN;
    long hi = mN;
    long cnt = 0;
    while (lo != 1) {
      do {
        ++hi;
      } while (Functions.GCD.l(hi, lo) != 1);
      do {
        --lo;
      } while (Functions.GCD.l(hi, lo) != 1);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
