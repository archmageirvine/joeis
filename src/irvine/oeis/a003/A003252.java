package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003252.
 * @author Sean A. Irvine
 */
public class A003252 extends A003231 {

  @Override
  public Z next() {
    final Z n = super.next();
    final Sequence s = new A003251();
    long m = 1;
    while (!s.next().equals(n)) {
      ++m;
    }
    return Z.valueOf(m);
  }

}
