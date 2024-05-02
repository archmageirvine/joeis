package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a030.A030078;

/**
 * A069457.
 * @author Sean A. Irvine
 */
public class A069487 extends Sequence1 {

  private final Sequence mA = new A030078();
  private final Sequence mB = new A000040();
  private Z mT = mA.next();
  private Z mP = mB.next();

  @Override
  public Z next() {
    final Z t = mT;
    mT = mA.next();
    final Z p = mP;
    mP = mB.next();
    return mT.multiply(p).subtract(t.multiply(mP));
  }
}

