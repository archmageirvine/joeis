package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001541;
import irvine.oeis.a001.A001542;
import irvine.oeis.a393.A393016;

/**
 * A391748 allocated for O\u011fuz Serdar Uzunlar.
 * @author Sean A. Irvine
 */
public class A391748 extends A393016 {

  private final Sequence mX = new A001541();
  private final Sequence mY = new A001542();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z x = mX.next();
      final Z y = mY.next();
      final Z t = y.square().add(x.multiply(y)).subtract(x.square());
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
