package irvine.oeis.a051;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A051861 Twice the positions in A051686 at which new primes appear in that sequence.
 * @author Sean A. Irvine
 */
public class A051861 extends A051686 {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z t = super.next();
      if (mSeen.add(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
