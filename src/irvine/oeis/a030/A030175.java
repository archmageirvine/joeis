package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030175 When squared gives number composed of digits {1,2,3}.
 * @author Sean A. Irvine
 */
public class A030175 implements Sequence {

  // No square ends with 2 or 3.
  // n^2 only ends with 1, if n ends with 1 or 9

  private Z mN = Z.NEG_ONE;
  private long mAdd = 2;

  private boolean is123(Z n) {
    while (!Z.ZERO.equals(n)) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (qr[1].compareTo(Z.THREE) > 0 || Z.ZERO.equals(qr[1])) {
        return false;
      }
      n = qr[0];
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(mAdd);
      mAdd = 10 - mAdd;
      if (is123(mN.square())) {
        return mN;
      }
    }
  }
}
