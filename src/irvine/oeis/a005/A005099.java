package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a002.A002145;

/**
 * A005099 <code>((</code> Primes <code>== -1 mod 4 ) + 1)/4</code>.
 * @author Sean A. Irvine
 */
public class A005099 extends A002145 {

  @Override
  public Z next() {
    return super.next().add(1).divide(4);
  }
}

