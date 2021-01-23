package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031341 a(n) = prime(8n).
 * @author Sean A. Irvine
 */
public class A031341 extends A031337 {

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

