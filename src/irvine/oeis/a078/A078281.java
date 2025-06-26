package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078281 A078278(n)/22.
 * @author Sean A. Irvine
 */
public class A078281 extends A078278 {

  @Override
  public Z next() {
    return super.next().divide(22);
  }
}

