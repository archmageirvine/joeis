package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a002.A002476;

/**
 * A024892 Numbers k such that <code>3*k+1</code> is prime.
 * @author Sean A. Irvine
 */
public class A024892 extends A002476 {

  @Override
  public Z next() {
    //return super.next().subtract(1).divide(3);
    // Can avoid -1 since division truncates here
    return super.next().divide(3);
  }
}
