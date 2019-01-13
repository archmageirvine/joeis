package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.a002.A002065;

/**
 * A030125.
 * @author Sean A. Irvine
 */
public class A030125 extends DecimalExpansionSequence {

  private final A002065 mB = new A002065();
  private CR mZ = CR.ZERO;
  private boolean mSign = false;
  private int mGood = 0;

  private int update() {
    mSign = !mSign;
    final Z t = mB.next();
    if (Z.ZERO.equals(t)) {
      mZ = mZ.add(CR.HALF_PI);
    } else {
      mZ = ComputableReals.SINGLETON.signedAdd(mSign, mZ, ComputableReals.SINGLETON.atan(CR.valueOf(t).inverse()));
    }
    return t.toString().length(); // Rough guide to precision of sum
  }

  @Override
  protected CR getCR() {
    return ComputableReals.SINGLETON.cot(mZ);
  }

  @Override
  public Z next() {
    // DecimalExpansionSequence assumes we have 32-digits of goodness looking ahead.
    // Try to make sure we have plenty of accuracy.
    while (mGood < mN + 100) {
      mGood = update();
    }
    return super.next();
  }
}
