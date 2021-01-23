package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030154 Squares such that in n and sqrt(n) the parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030154 extends A030153 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
