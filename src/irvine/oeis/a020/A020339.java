package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;

/**
 * A020339 a(n)^2 is the least square base-n doublet (base-n representation is the concatenation of 2 identical strings).
 * @author Sean A. Irvine
 */
public class A020339 extends Sequence2 {

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
