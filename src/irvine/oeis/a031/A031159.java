package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031159 Twin lucky numbers (upper terms).
 * @author Sean A. Irvine
 */
public class A031159 extends A031158 {

  @Override
  public Z next() {
    return super.next().add(2);
  }
}
