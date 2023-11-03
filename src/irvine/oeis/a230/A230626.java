package irvine.oeis.a230;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.prime.HomePrimeSequence;

/**
 * A230626 Iterate the map x -&gt; A230625(x) starting at n; sequence gives number of steps to reach a prime, or -1 if no prime is ever reached.
 * @author Sean A. Irvine
 */
public class A230626 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long  c = -1;
    final HomePrimeSequence seq = new HomePrimeSequence(++mN, 2, true, true);
    Z u = null;
    Z t;
    while ((t = seq.next()) != null) {
      ++c;
      u = t;
    }
    if (u == null) {
      throw new RuntimeException();
    }
    return u.isProbablePrime(32) ? Z.valueOf(c) : Z.NEG_ONE;
  }
}
