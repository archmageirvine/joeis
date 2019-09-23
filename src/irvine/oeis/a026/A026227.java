package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026227 <code>a(n) = (1/3)*(s(n) + 2)</code>, where s <code>= A026226</code>.
 * @author Sean A. Irvine
 */
public class A026227 extends A026226 {

  @Override
  public Z next() {
    return super.next().add(2).divide(3);
  }
}
