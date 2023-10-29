package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a002.A002145;

/**
 * A005099 (( Primes == -1 (mod 4) ) + 1)/4.
 * @author Sean A. Irvine
 */
public class A005099 extends A002145 {

  @Override
  public Z next() {
    return super.next().add(1).divide(4);
  }
}

