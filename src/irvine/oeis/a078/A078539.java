package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a020.A020492;

/**
 * A078122.
 * @author Sean A. Irvine
 */
public class A078539 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    mN += 2;
    final Sequence seq = new ComplementSequence(new A020492(), Z.ONE);
    while (true) {
      final Z k = seq.next();
      if (Functions.SIGMA.z(mN, k).mod(Functions.PHI.l(k)) == 0) {
        return k;
      }
    }
  }
}

