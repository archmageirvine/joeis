package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026227 a(n) = (1/3)*(s(n) + 2), where s = A026226.
 * @author Sean A. Irvine
 */
public class A026227 extends A026226 {

  @Override
  public Z next() {
    return super.next().add(2).divide(3);
  }
}
