package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A040164 |First digit - last digit| for n-th prime.
 * @author Sean A. Irvine
 */
public class A040164 extends A000040 {

  @Override
  public Z next() {
    final String s = super.next().toString();
    return Z.valueOf(Math.abs(s.charAt(0) - s.charAt(s.length() - 1)));
  }
}
