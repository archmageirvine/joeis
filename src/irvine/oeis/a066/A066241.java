package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066241 1 + number of anti-divisors of n.
 * @author Sean A. Irvine
 */
public class A066241 extends A066272 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
