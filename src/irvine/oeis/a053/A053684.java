package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a001.A001113;

/**
 * A053684 Positions where there is a repeated digit in decimal expansion of e (starting count at decimal point).
 * @author Sean A. Irvine
 */
public class A053684 extends A001113 {

  /** Construct the sequence. */
  public A053684() {
    super(0);
  }

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.equals(t)) {
        return Z.valueOf(mN - 2);
      }
    }
  }
}
