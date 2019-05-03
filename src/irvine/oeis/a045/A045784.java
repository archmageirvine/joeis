package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045784 Squares with initial digit <code>'1'</code>.
 * @author Sean A. Irvine
 */
public class A045784 implements Sequence {

  // Smarter than trying each number in turn ...

  protected Z mN = Z.ZERO;
  private Z mLimit = Z.valueOf(2);

  protected void update() {
    mLimit = mLimit.multiply(10);
    final Z b = mLimit.divide2();
    mN = b.sqrt().subtract(b.auxiliary());
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z square = mN.square();
      if (square.compareTo(mLimit) >= 0) {
        update();
      } else {
        return square;
      }
    }
  }
}

