package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031160 Twin lucky numbers (middle terms).
 * @author Sean A. Irvine
 */
public class A031160 extends A031158 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
