package irvine.oeis.a026;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026409 For <code>n &gt;= 1, n</code> n's take places at stage n: the first takes the least untaken place <code>(l.u.p)</code> and for <code>2&lt;=k&lt;=n</code>, the <code>k-th n</code> takes the l.u.p. more than <code>n-1</code> places past the place of the <code>(k-1)st n</code>.
 * @author Sean A. Irvine
 */
public class A026409 implements Sequence {

  protected final TreeMap<Long, Long> mMap = new TreeMap<>();
  private long mM = 0; // Number to be inserted
  private long mN = 0; // Position we want output for

  protected void step(final long n) {
    ++mM;
    mMap.put(n, mM);
    for (long k = 2, s = n; k <= mM; ++k) {
      s += mM;
      while (mMap.containsKey(s)) {
        ++s;
      }
      mMap.put(s, mM);
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (!mMap.containsKey(mN)) {
      step(mN);
    }
    return Z.valueOf(mMap.pollFirstEntry().getValue());
  }
}
