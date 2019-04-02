package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001841 Related to Zarankiewicz's problem.
 * @author Sean A. Irvine
 */
public class A001841 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    if (++mN < 6) {
      switch ((int) mN) {
        case 3:
          return Z.THREE;
        case 4:
          return Z.FIVE;
        default:
          return Z.TEN;
      }
    }
    final Z s = Z.valueOf(mN / 6);
    final Z s2 = s.square().multiply(18);
    switch ((int) (mN % 6)) {
      case 0:
        return s2.subtract(s.multiply(4));
      case 1:
        return s2.add(s.multiply(3));
      case 2:
        return s2.add(s.multiply(8));
      case 3:
        return s2.add(s.multiply(15)).add(3);
      case 4:
        return s2.add(s.multiply(20)).add(5);
      default:
        return s2.add(s.multiply(27)).add(10);
    }
  }
}
