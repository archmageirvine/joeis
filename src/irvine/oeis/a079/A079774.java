package irvine.oeis.a079;

import irvine.math.z.Z;

/**
 * A079774 Consider the triangle shown below in which the n-th row contains the n smallest terms in increasing order having a common factor &gt; 1, the first term being the n-th composite number; sequence gives the last term of each row.
 * @author Sean A. Irvine
 */
public class A079774 extends A079775 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (int k = 1; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}

