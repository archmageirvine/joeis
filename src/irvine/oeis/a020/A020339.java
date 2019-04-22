package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020339.
 * @author Sean A. Irvine
 */
public class A020339 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    final Sequence seq = new A020338(++mN);
    while (true) {
      final Z n = seq.next();
      final Z s = n.sqrt();
      if (n.auxiliary() == 1) {
        return s;
      }
    }
  }
}
