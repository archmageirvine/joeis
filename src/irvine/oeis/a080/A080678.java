package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A080678 Rooted at a(0)=0 and a(1)=a(2)=a(3)=1, 4 cases of index mod 4: a(4n)=4*a(n), a(4n+1)= 3*a(n)+a(n+1), a(4n+2) = 2*a(n)+2*a(n+1), and a(4n+3) = a(n)+3*a(n+1).
 * @author Sean A. Irvine
 */
public class A080678 extends CachedSequence {

  /** Construct the sequence. */
  public A080678() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      if (n <= 3) {
        return Z.ONE;
      }
      switch (n & 3) {
        case 0:
          return self.a(n / 4).multiply(4);
        case 1:
          return self.a(n / 4).multiply(3).add(self.a(n / 4 + 1));
        case 2:
          return self.a(n / 4).multiply2().add(self.a(n / 4 + 1).multiply2());
        default: // 3
          return self.a(n / 4).add(self.a(n / 4 + 1).multiply(3));
      }
    });
  }
}
