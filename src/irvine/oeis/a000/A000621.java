package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000621 Number of monosubstituted alkanes <code>C(n-1)H(2n-1)-X</code> with <code>n-1</code> carbon atoms that are not stereoisomers.
 * @author Sean A. Irvine
 */
public class A000621 extends A000620 {

  @Override
  public Z next() {
    super.next();
    return mPn.get(mN);
  }
}
