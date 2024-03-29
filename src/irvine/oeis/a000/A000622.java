package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000622 Number of monosubstituted alkanes C(n)H(2n+1)-X of the form shown in the Comments lines that are stereoisomers.
 * @author Sean A. Irvine
 */
public class A000622 extends A000620 {

  @Override
  public Z next() {
    super.next();
    return mSs.get(mN);
  }
}
