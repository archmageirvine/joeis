package irvine.oeis.a026;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A026409 For n &gt;= 1, n n's take places at stage n: the first takes the least untaken place (l.u.p) and for 2&lt;=k&lt;=n, the k-th n takes the l.u.p. more than n-1 places past the place of the (k-1)st n.
 * @author Sean A. Irvine
 */
public class A026409 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A026409(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A026409() {
    super(1);
  }

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
