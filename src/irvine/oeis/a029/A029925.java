package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029925 Convert n from degrees Celsius to Fahrenheit.
 * @author Sean A. Irvine
 */
public class A029925 implements Sequence {

  private Z mN = Z.valueOf(307);

  @Override
  public Z next() {
    mN = mN.add(18);
    return mN.divide(10);
  }
}
