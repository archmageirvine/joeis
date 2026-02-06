package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A392742 A 4-automatic binary sequence with irreducible nested recurrence (see Comments).
 * @author Sean A. Irvine
 */
public class A392742 extends CachedSequence {

  // a(n) is defined by a(0)=0, a(1)=1, and for n>=0: a(4n) = a(n), a(4n+1) = 1-a(n), a(4n+2) = a(2n+a(n)), a(4n+3) = 1-a(2n+a(n)).

  /** Construct the sequence. */
  public A392742() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      if (n == 1) {
        return Z.ONE;
      }
      final int m = n >>> 2;
      switch (n & 3) {
        case 0:
          return self.a(m);
        case 1:
          return Z.ONE.subtract(self.a(m));
        case 2:
          return self.a(2 * m + self.a(m).intValueExact());
        default:
          return Z.ONE.subtract(self.a(2 * m + self.a(m).intValueExact()));
      }
    });
  }
}
