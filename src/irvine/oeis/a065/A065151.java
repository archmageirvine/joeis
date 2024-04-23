package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a064.A064722;

/**
 * A065151 a(n) = prime(1 + A064722(n)).
 * @author Sean A. Irvine
 */
public class A065151 extends A064722 {

  {
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return Functions.PRIME.z(super.next().add(1));
  }
}

