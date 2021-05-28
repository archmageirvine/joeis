package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.HomePrimeSequence;
import irvine.oeis.Sequence;

/**
 * A037273 Number of steps to reach a prime under "replace n with concatenation of its prime factors", or -1 if no prime is ever reached.
 * @author Sean A. Irvine
 */
public class A037273 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.NEG_ONE;
    }
    final HomePrimeSequence hp = new HomePrimeSequence(mN);
    long c = -1;
    while (hp.next() != null) {
      ++c;
    }
    return Z.valueOf(c);
  }
}

