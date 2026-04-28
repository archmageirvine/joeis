package irvine.oeis.a084;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A084659 Number of labeled claw-free cubic graphs on 2n nodes (not necessarily connected).
 * @author Sean A. Irvine
 */
public class A084659 extends CachedSequence {

  private static final Z C = new Z("673229602575129600000");

  /** Construct the sequence. */
  public A084659() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      if (n <= 1) {
        return Z.ZERO;
      }
      --n;
      final long m = 2 * n + 1;
      return Binomial.binomial(m, 3).multiply(self.a(n - 1)).multiply(6 * n - 5)
        .add(Binomial.binomial(m, 5).multiply(self.a(n - 2)).multiply(60 * (2 * n * n - 7)))
        .add(Binomial.binomial(m, 7).multiply(self.a(n - 3)).multiply(420 * (12 * n - 31)))
        .subtract(Binomial.binomial(m, 9).multiply(self.a(n - 4)).multiply(60480 * (4 * n - 19)))
        .subtract(Binomial.binomial(m, 11).multiply(self.a(n - 5)).multiply(3326400 * (6 * n * n - 54 * n + 127)))
        .subtract(Binomial.binomial(m, 13).multiply(self.a(n - 6)).multiply(172972800 * (9 * n * n - 108 * n + 347)))
        .subtract(Binomial.binomial(m, 15).multiply(self.a(n - 7)).multiply(54486432000L).multiply(n - 1))
        .add(Binomial.binomial(m, 17).multiply(self.a(n - 8)).multiply(59281238016000L).multiply(n - 7))
        .add(Binomial.binomial(m, 19).multiply(self.a(n - 9)).multiply(422378820864000L).multiply(18 * n - 97))
        .add(Binomial.binomial(m, 21).multiply(self.a(n - 10)).multiply(6563766876226560000L))
        .add(Binomial.binomial(m, 23).multiply(self.a(n - 11)).multiply(C));
    });
  }
}
