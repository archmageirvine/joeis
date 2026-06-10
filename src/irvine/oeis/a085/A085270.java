package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085270 Integer part of the conversion from miles to kilometers.
 * @author Sean A. Irvine
 */
public class A085270 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(25146).divide(15625);
  }
}
