package irvine.oeis.a050;

import java.util.Map;

import irvine.math.PrimePowers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A050376 <code>"Fermi-Dirac</code> primes": numbers of the form <code>p^(2^k)</code> where p is prime and k <code>&gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A050376 implements Sequence {

  private final PrimePowers mPP = new PrimePowers();
  {
    mPP.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Map.Entry<Long, Pair<Long, Long>> e = mPP.next();
      final long exponent = e.getValue().right();
      if ((exponent & (exponent - 1)) == 0) {
        return Z.valueOf(e.getKey());
      }
    }
  }
}
