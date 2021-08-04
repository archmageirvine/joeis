package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.English;

/**
 * A049528 Number of letters in n-th prime (in English).
 * @author Sean A. Irvine
 */
public class A049528 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(English.SINGLETON.toRawText(super.next().intValueExact()).length());
  }
}
