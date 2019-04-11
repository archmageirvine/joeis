package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001903 Final digit of <code>7^n</code>.
 * @author Sean A. Irvine
 */
public class A001903 implements Sequence {

  private long mV = 3;

  @Override
  public Z next() {
    mV *= 7;
    mV %= 10;
    return Z.valueOf(mV);
  }
}
