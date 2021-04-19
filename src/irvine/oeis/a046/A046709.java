package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046709 Irrational unitary phi amicable number: two numbers which satisfy uphi(a)=uphi(b)=2*(a^2-b^2)^(1/2) where if x=Product p(i)^r(i) then uphi(x)=Product (p(i)^r(i)-1) (A047994).
 * @author Sean A. Irvine
 */
public class A046709 implements Sequence {

  // Ordering of terms here unclear.
  // Perhaps always divisible by 2^4.3^2.5^2.7 ?
  // Terms missing? e.g. 5358990 (see email I sent Yasutoshi Kohmoto)

  private Z mN = Z.ZERO;

  protected Z select(final Z a, final Z b) {
    return a;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z uphi = Cheetah.factor(mN).unitaryPhi();
      final Z d = mN.square().shiftLeft(2).add(uphi.square());
      final Z[] s = d.sqrtAndRemainder();
      if (s[1].isZero() && s[0].isEven()) {
        final Z b = s[0].divide2();
        if (b.compareTo(mN) > 0 && Cheetah.factor(b).unitaryPhi().equals(uphi)) {
          return select(mN, b);
        }
      }
    }
  }
}
