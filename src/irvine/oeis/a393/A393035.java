package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a134.A134816;

/**
 * A393035 allocated for F\u0131rat Karay\u0131ld\u0131z.
 * @author Sean A. Irvine
 */
public class A393035 extends Sequence1 {

  private final Sequence mPadovan = new A134816();
  private Z mA = mPadovan.next().square();
  private long mN = -1;


  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mPadovan.next().square();
      if (mA.add(t).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
