package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a006.A006577;

/**
 * A066756 Smallest number that requires n^3 steps to reach 1 in its Collatz trajectory (counting x/2 and 3x+1 steps).
 * @author Sean A. Irvine
 */
public class A066756 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Sequence s = new A006577();
    final Z target = Z.valueOf(++mN).pow(3);
    long m = 0;
    while (true) {
      ++m;
      if (s.next().equals(target)) {
        return Z.valueOf(m);
      }
    }
  }
}

