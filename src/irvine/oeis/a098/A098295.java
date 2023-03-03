package irvine.oeis.a098;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;

/**
 * A098295 ((3/2)^n)/2^a(n) lies in the half-open interval [1,2).
 * @author Georg Fischer
 */
public class A098295 extends A098294 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
