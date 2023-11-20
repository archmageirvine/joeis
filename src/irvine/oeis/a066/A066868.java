package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005385;

/**
 * A066867.
 * @author Sean A. Irvine
 */
public class A066868 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Sequence seq = new A005385();
    Z sum = Z.valueOf(++mN);
    long k = 0;
    while (true) {
      ++k;
      sum = sum.add(seq.next());
      if (sum.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
