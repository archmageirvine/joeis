package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a001.A001069;

/**
 * A010096 log2*(n) (version 1): number of times floor(log_2(x)) is used in floor(log_2(floor(log_2(...(floor(log_2(n)))...)))) <code>= 0</code>.
 * @author Sean A. Irvine
 */
public class A010096 extends A001069 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
