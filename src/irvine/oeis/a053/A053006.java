package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a036.A036259;

/**
 * A053006 Numbers m for which there exist d(1),...,d(m), each in {0,1}, such that Sum_{i=1..m-k} d(i)*d(i+k) is odd for all k=0,...,m-1.
 * @author Sean A. Irvine
 */
public class A053006 extends A036259 {

  @Override
  public Z next() {
    return super.next().add(1).divide2();
  }
}
