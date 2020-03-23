package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030152 Squares in which parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030152 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      if (A030141.isOk(s)) {
        return s;
      }
    }
  }
}
