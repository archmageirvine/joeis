package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a006.A006577;

/**
 * A066773 Smallest number which requires n^2 steps in the 3x+1 problem.
 * @author Sean A. Irvine
 */
public class A066773 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Sequence s = new A006577();
    final Z target = Z.valueOf(++mN).square();
    long m = 0;
    while (true) {
      ++m;
      if (s.next().equals(target)) {
        return Z.valueOf(m);
      }
    }
  }
}

