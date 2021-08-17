package irvine.oeis.a050;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050602 Recursion counts for summation table A003056 with formula a(y,x): if (y AND x) = 0 then (y XOR x), otherwise = a((y XOR x),2*(y AND x)).
 * @author Sean A. Irvine
 */
public class A050602 extends MemoryFunction2<Long, Long> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Long compute(final Long n, final Long m) {
    return (m & n) == 0 ? 0L : 1 + get(n ^ m, (n & m) << 1);
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    return Z.valueOf(get(mN - mM, mM));
  }
}
