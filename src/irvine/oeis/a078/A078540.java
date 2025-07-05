package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a020.A020492;

/**
 * A078122.
 * @author Sean A. Irvine
 */
public class A078540 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    final Sequence seq = new ComplementSequence(new A020492(), Z.ONE);
    while (true) {
      final Z k = seq.next();
      if (Functions.SIGMA.z(p, k).mod(Functions.PHI.l(k)) == 0) {
        return k;
      }
    }
  }
}

