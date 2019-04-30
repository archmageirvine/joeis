package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001051 Number of subgroups of order n in orthogonal group <code>O(3)</code>.
 * @author Sean A. Irvine
 */
public class A001051 implements Sequence {

  private static final Z[] SEQ = {Z.SEVEN, Z.ONE, Z.FIVE, Z.ONE};

  private int mN = 0;

  @Override
  public Z next() {
    switch (++mN) {
    case 2:
      return Z.THREE;
    case 4:
      return Z.FIVE;
    case 12:
    case 48:
    case 60:
    case 120:
      return Z.EIGHT;
    case 24:
      return Z.TEN;
    default:
      if (mN <= 0) {
        throw new UnsupportedOperationException();
      }
      return SEQ[mN & 3];
    }
  }
}
