package irvine.oeis.a053;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014410 Elements in Pascal's triangle (by row) that are not 1.
 * @author Sean A. Irvine
 */
public class A053203 implements Sequence {

  private long mN = 5;
  private long mM = 3;

  @Override
  public Z next() {
    if (++mM >= mN - 2) {
      ++mN;
      mM = 3;
    }
    return Binomial.binomial(mN, mM).mod(Z.valueOf(mN));
  }
}
