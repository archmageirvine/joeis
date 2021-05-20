package irvine.oeis.a047;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047776 Number of dissectable polyhedra with symmetry of type A.
 * @author Sean A. Irvine
 */
public class A047776 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN < 5) {
      return Z.ZERO;
    }
    Q s = new Q(Binomial.binomial(3 * mN, 2 * mN + 2), Z.valueOf(mN - 1).multiply(3 * mN));
    if ((mN & 1) == 1) {
      s = s.subtract(new Q(Binomial.binomial((3 * mN - 1) / 2, mN + 1).multiply(3), Z.valueOf(mN - 1)));
    } else {
      s = s.subtract(new Q(Binomial.binomial(3 * mN / 2, mN + 1).multiply(7), Z.valueOf(3 * mN)));
    }

    switch ((int) (mN % 3)) {
      case 1:
        s = s.subtract(new Q(Binomial.binomial(mN - 1, (2 * mN + 1) / 3), Z.valueOf(mN - 1)));
        break;
      case 2:
        s = s.subtract(new Q(Binomial.binomial(mN - 1, (2 * mN + 2) / 3), Z.valueOf(mN - 2)));
        break;
      default:
        break;
    }

    switch ((int) (mN % 4)) {
      case 1:
        s = s.add(new Q(Binomial.binomial((3 * mN - 3) / 4, (mN + 1) / 2).multiply2(), Z.valueOf(3 * mN - 3)));
        s = s.add(new Q(Binomial.binomial((3 * mN + 1) / 4, (mN + 3) / 2).multiply(4), Z.valueOf(mN - 1)));
        s = s.add(new Q(Binomial.binomial((3 * mN - 3) / 4, (mN + 1) / 2).multiply(4), Z.valueOf(mN + 3)));
        break;
      case 2:
        s = s.add(new Q(Binomial.binomial((3 * mN - 2) / 4, mN / 2 + 1).multiply(8), Z.valueOf(mN - 2)));
        break;
      case 3:
        s = s.add(new Q(Binomial.binomial((3 * mN - 1) / 4, (mN + 3) / 2).multiply(12), Z.valueOf(mN - 3)));
        break;
      default: // 0
        s = s.add(new Q(Binomial.binomial(3 * (mN / 4) - 1, mN / 2 + 1).multiply(12), Z.valueOf(mN - 4)));
        break;
    }

    switch ((int) (mN % 6)) {
      case 1:
        s = s.add(new Q(Binomial.binomial((mN - 1) / 2, (mN + 2) / 3).multiply(6), Z.valueOf(mN - 1)));
        break;
      case 2:
        s = s.add(new Q(Binomial.binomial(mN / 2 - 1, (mN + 1) / 3).multiply(4), Z.valueOf(mN - 2)));
        s = s.add(new Q(Binomial.binomial(mN / 2, (mN + 4) / 3).multiply(6), Z.valueOf(mN - 2)));
        s = s.add(new Q(Binomial.binomial(mN / 2 - 1, (mN + 1) / 3).multiply(6), Z.valueOf(mN + 4)));
        break;
      case 4:
        s = s.add(new Q(Binomial.binomial(mN / 2 - 1, (mN + 2) / 3).multiply(12), Z.valueOf(mN - 4)));
        break;
      case 5:
        s = s.add(new Q(Binomial.binomial((mN - 1) / 2, (mN + 1) / 3).multiply(9), Z.valueOf(mN + 4)));
        break;
      case 0:
        break;
    }

    switch ((int) (mN % 12)) {
      case 2:
        s = s.subtract(new Q(Binomial.binomial((mN - 2) / 4, (mN + 4) / 6).multiply(12), Z.valueOf(mN - 2)));
        break;
      case 5:
        s = s.add(new Q(Binomial.binomial((mN - 5) / 4, (mN - 5) / 6).multiply2(), Z.valueOf(mN + 1)));
        break;
      case 8:
        s = s.subtract(new Q(Binomial.binomial(mN / 4 - 1, (mN - 2) / 6).multiply(12), Z.valueOf(mN + 4)));
        break;
      default:
        break;
    }

    switch ((int) (mN % 24)) {
      case 5:
        s = s.subtract(new Q(Binomial.binomial((mN - 5) / 8, (mN - 5) / 12).multiply(12), Z.valueOf(mN + 7)));
        break;
      case 17:
        s = s.subtract(new Q(Binomial.binomial((mN - 9) / 8, (mN - 5) / 12).multiply(24), Z.valueOf(mN + 7)));
        break;
      default:
        break;
    }

    return s.toZ().divide2();
  }
}

