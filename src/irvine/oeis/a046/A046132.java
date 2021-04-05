package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a023.A023200;

/**
 * A046132 Larger member p+4 of cousin primes (p, p+4).
 * @author Sean A. Irvine
 */
public class A046132 extends A023200 {

  @Override
  public Z next() {
    return super.next().add(4);
  }
}
