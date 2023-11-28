package irvine.oeis.a066;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a001.A001221;

/**
 * A066996 Numbers n such that Sum_{i=2..n} 1/A001221(i) is an integer.
 * @author Sean A. Irvine
 */
public class A066996 extends A001221 {

  private Q mSum = new Q(super.next());

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(new Q(Z.ONE, super.next()));
      if (mSum.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}

