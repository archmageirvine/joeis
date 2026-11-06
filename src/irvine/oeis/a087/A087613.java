package irvine.oeis.a087;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A087613 Number of labeled acyclic preferences/voting outcomes, indifference and undecidedness/incompleteness permitted (Social Choice Theory).
 * @author Sean A. Irvine
 */
public class A087613 extends CachedSequence {

  /** Construct the sequence. */
  public A087613() {
    super(1, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(1, n, k -> Z.NEG_ONE.pow(k + 1)
        .multiply(Binomial.binomial(n, k))
        .multiply(Z.THREE.pow(k * (n - k)))
        .multiply(self.a(n - k))
        .shiftLeft(k * (k - 1) / 2));
    });
  }
}

