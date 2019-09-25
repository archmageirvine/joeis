package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002212;
import irvine.oeis.a039.A039919;

/**
 * A026298 Number of polyhexes of class <code>PF2</code>.
 * @author Sean A. Irvine
 */
public class A026298 extends A039919 {

  private final Sequence mS = new A002212();
  {
    super.next();
    mS.next();
    mS.next();
    mS.next();
  }

  private Z mB = mS.next();
  private Z mC = mS.next();
  private Z mT = null;

  @Override
  public Z next() {
    final Z a = mB;
    mB = mC;
    mC = mS.next();
    final Z m;
    if (mT != null) {
      m = mT;
      mT = null;
    } else {
      mT = super.next();
      m = mT;
    }
    //System.out.println(mA + " " + mB + " " + mC + " " + m);
    return mC.subtract(mB.multiply(6)).add(a.multiply(8)).multiply(3).add(m);
  }
}
