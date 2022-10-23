package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001903 Final digit of 7^n.
 * @author Sean A. Irvine
 */
public class A001903 extends Sequence0 {

  private long mV = 3;

  @Override
  public Z next() {
    mV *= 7;
    mV %= 10;
    return Z.valueOf(mV);
  }
}
