package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a001.A001069;

/**
 * A010096.
 * @author Sean A. Irvine
 */
public class A010096 extends A001069 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
