package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A045533 Concatenate the n-th and (n+1)st prime.
 * @author Sean A. Irvine
 */
public class A045533 extends A000040 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder(mA.toString());
    mA = super.next();
    sb.append(mA);
    return new Z(sb);
  }
}
