package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a002.A002618;

/**
 * A046152 a(n) = n*phi(n) + 1.
 * @author Sean A. Irvine
 */
public class A046152 extends A002618 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
