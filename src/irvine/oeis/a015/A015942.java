package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.a014.A014945;

/**
 * A015942 Positive integers n such that <code>n | (2^n + n/2 - 1)</code>.
 * @author Sean A. Irvine
 */
public class A015942 extends A014945 {

  {
    next();
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
