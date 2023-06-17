package irvine.oeis.a050;

import java.util.Map;

import irvine.math.PrimePowers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Pair;

/**
 * A050376 "Fermi-Dirac primes": numbers of the form p^(2^k) where p is prime and k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A050376 extends AbstractSequence {

  /* Construct the sequence. */
  public A050376() {
    super(1);
  }

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
