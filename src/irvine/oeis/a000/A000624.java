package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000624 Number of monosubstituted alkanes <code>C(n)H(2n+1)-X</code> of the form shown in the Comments lines that are not stereoisomers.
 * @author Sean A. Irvine
 */
public class A000624 extends A000620 {

  @Override
  public Z next() {
    super.next();
    return mTn.get(mN);
  }
}
