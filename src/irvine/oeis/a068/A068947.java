package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068947 Square roots of <code>A068809</code>.
 * @author Sean A. Irvine
 */
public class A068947 extends A068809 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}

