package irvine.oeis.a029;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029926 Convert n from degrees Fahrenheit to nearest integer Celsius.
 * @author Sean A. Irvine
 */
public class A029926 extends Sequence0 {

  private Z mN = Z.valueOf(-165);

  @Override
  public Z next() {
    mN = mN.add(5);
    return new Q(mN, Z.NINE).round();
  }
}
