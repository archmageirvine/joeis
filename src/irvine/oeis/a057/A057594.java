package irvine.oeis.a057;

<<<<<<< Updated upstream
import irvine.math.z.Z;

/**
 * A057594 Triangle T(n,k) giving floor( (2*p mod n-1)/2), where p = period of sequence k^i (i=0,1,2,...) mod n (n &gt;= 2, 2&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A057594 extends A057595 {

  @Override
  public Z next() {
    return super.next().divide2();
=======
import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057593.
 * @author Sean A. Irvine
 */
public class A057593 implements Sequence {

  protected long mN = 1;
  private long mM = 0;

  private long t(final long n, final long m) {
    if (LongUtils.gcd(n, m) == 1) {
      // no preperiod in this case
      long cnt = 0;
      long k = 1;
      do {
        ++cnt;
        k *= m;
        k %= n;
      } while (k != 1);
      return cnt;
    }
    final TreeSet<Long> seen = new TreeSet<>();
    long u = 1;
    long k;
    while (true) {
      seen.clear();
      k = u;
      while (seen.add(k)) {
        k *= m;
        k %= n;
      }
      if (k != 0) {
        break;
      }
      u *= m;
      if (u >= n) {
        return 1;
      }
    }
    // k is now a repeated element
    final long s = k;
    long cnt = 0;
    do {
      ++cnt;
      k *= m;
      k %= n;
    } while (k != s);
    return cnt;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(t(mN, mM));
>>>>>>> Stashed changes
  }
}
