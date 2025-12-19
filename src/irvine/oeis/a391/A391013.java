package irvine.oeis.a391;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391013 allocated for Benjamin W P Cornish.
 * @author Sean A. Irvine
 */
public class A391013 extends Sequence1 {

  private CR inscribe(final long n) {
    return CR.TAU.divide(n).sin().multiply(n).divide(2);
  }

  private CR circumscribe(final long n) {
    return CR.PI.divide(n).tan().multiply(n);
  }

  private boolean agreement(final Z t, final CR a, final CR b) {
    return a.multiply(t).floor().equals(b.multiply(t).floor());
  }

  private int mN = 0;
  private long mM = 3;

  @Override
  public Z next() {
    final Z t = Z.TEN.pow(mN++);
    while (true) {
      if (agreement(t, inscribe(mM), circumscribe(mM))) {
        return Z.valueOf(mM);
      }
      ++mM;
    }
  }
}
