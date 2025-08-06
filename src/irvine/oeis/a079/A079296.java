package irvine.oeis.a079;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.a000.A000040;

/**
 * A079296 Primes ordered by decreasing value of the function p -&gt; sqrt(q) - sqrt(p) where q is the next prime after p.
 * @author Sean A. Irvine
 */
public class A079296 extends A000040 implements Conjectural {

  private static final int HEURISTIC = 100;
  private final TreeMap<CR, Z> mA = new TreeMap<>();
  private CR mBest = CR.NEG_ONE;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.size() < mN * HEURISTIC) {
      final Z p = super.next();
      // We compute -f wrt to sequence definition, so that TreeMap sort works naturally
      final CR f = CR.valueOf(p).sqrt().subtract(CR.valueOf(mPrime.nextPrime(p)).sqrt());
      if (f.compareTo(mBest) < 0) {
        throw new RuntimeException("Heuristic failed: " + p + " should have been output earlier");
      }
      mA.put(f, p);
    }
    final Map.Entry<CR, Z> e = mA.pollFirstEntry();
    mBest = e.getKey();
    return e.getValue();
  }
}
