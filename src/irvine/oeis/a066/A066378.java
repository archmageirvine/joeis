package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066378 Floor(log(n)) divides n.
 * @author Georg Fischer
 */
public class A066378 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    while (mN % ((long) Math.log(mN)) != 0) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
