package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A074696.
 * @author Sean A. Irvine
 */
public class A074726 extends Sequence1 {

  private long mN = 0;
  private final Sequence mF = new A000045().skip();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z f = mF.next();
      if (Functions.SIGMA1.z(f).compareTo(f.multiply2()) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
