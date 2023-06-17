package irvine.oeis.a026;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A026400 For n &gt;= 1, n n's take places at stage n: the first n takes the least untaken place (l.u.p.) and for 2&lt;=k&lt;=n, the k-th n takes the l.u.p. at least (k-1)*n places past the place of the first n.
 * @author Sean A. Irvine
 */
public class A026400 extends AbstractSequence {

  /** Construct the sequence. */
  public A026400() {
    super(1);
  }

  protected final TreeMap<Long, Long> mMap = new TreeMap<>();
  private long mM = 0; // Number to be inserted
  private long mN = 0; // Position we want output for

  protected void step(final long n) {
    ++mM;
    mMap.put(n, mM);
    for (long k = 2; k <= mM; ++k) {
      long s = (k - 1) * mM + n;
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
