package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038155 a(n) = (n!/2) * Sum_{k=0..n-2} 1/k!.
 * @author Sean A. Irvine
 */
public class A038155 extends A038154 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
