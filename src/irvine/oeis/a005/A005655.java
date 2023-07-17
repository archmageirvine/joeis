package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005655 Number of board configurations in Mu Torere (for one player).
 * @author Sean A. Irvine
 */
public class A005655 extends A005654 {

  /** Construct the sequence. */
  public A005655() {
    super(0);
  }

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
