package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A046882 Ultrafactorials: a(n) = n!^n!.
 * @author Sean A. Irvine
 */
public class A046882 extends A000142 {

  @Override
  public Z next() {
    final Z f = super.next();
    return f.pow(f);
  }
}
