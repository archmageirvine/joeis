package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A032590 Primes in which 'last digit cycle' is <code>{1,3,7,9}</code>.
 * @author Sean A. Irvine
 */
public class A032590 extends A000040 {

  private static final long[] RESIDUES = {1, 3, 7, 9};
  private int mIndex = -1;

  @Override
  public Z next() {
    if (++mIndex == RESIDUES.length) {
      mIndex = 0;
    }
    final long r = RESIDUES[mIndex];
    while (true) {
      final Z p = super.next();
      if (p.mod(10) == r) {
        return p;
      }
    }
  }
}
