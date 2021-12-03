package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a036.A036259;

/**
 * A053006 Values of n for which there exist d(1),...,d(n), each in {0,1}, such that Sum[d(i)d(i+k),i=1,n-k] is odd for all k=0,...,n-1.
 * @author Sean A. Irvine
 */
public class A053006 extends A036259 {

  @Override
  public Z next() {
    return super.next().add(1).divide2();
  }
}
