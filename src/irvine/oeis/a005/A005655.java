package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005655 Board configurations in Mu Torere (for one <code>player)</code>.
 * @author Sean A. Irvine
 */
public class A005655 extends A005654 {

  private A005648 mA5648 = new A005648();
  private boolean mFirst = true;

  @Override
  public Z next() {
    final Z t;
    if (mFirst) {
      t = Z.ZERO;
      mFirst = false;
    } else {
      t = super.next().multiply2();
    }
    return t.add(mA5648.next());
  }
}
