package irvine.oeis.a074;

import irvine.math.z.Z;

/**
 * A074654.
 * @author Sean A. Irvine
 */
public class A074654 extends A074653 {

  @Override
  public Z next() {
    return super.next().divide(120);
  }
}
