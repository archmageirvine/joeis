package irvine.oeis.a081;
// Generated by gen_seq4.pl nthprime 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A081227 <code>a(n)</code> is the number of digits in common between n and the n-th prime in base 10.
 * @author Georg Fischer
 */
public class A081227 extends A000040 {
  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z nextPrime = super.next();
    final int[] dcn = ZUtils.digitCounts(Z.valueOf(mN));
    final int[] dcp = ZUtils.digitCounts(nextPrime);
    int common = 0;
    int ind = 0;
    while (ind < 10) {
      if (dcn[ind] > 0 && dcp[ind] > 0) {
        ++common;
      }
      ++ind;
    }

    return Z.valueOf(common);
  }
}
