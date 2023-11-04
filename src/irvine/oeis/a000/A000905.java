package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A000905 Hamilton numbers.
 * @author Sean A. Irvine
 */
public class A000905 extends CachedSequence {

  /** Construct the sequence. */
  public A000905() {
    super(1, (self, n) -> {
      if (Z.ONE.equals(n)) {
        return Z.TWO;
      } else {
        Z s = Z.TWO;
        for (Z k = Z.ONE; k.compareTo(n) <= 0; k = k.add(1)) {
          final Z b = Binomial.binomial(self.a(n.subtract(k)), k.add(1));
          s = s.signedAdd(k.isOdd(), b);
        }
        return s;
      }
    });
  }
}

