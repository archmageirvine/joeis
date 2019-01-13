package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014748.
 * @author Sean A. Irvine
 */
public class A014748 extends A014467 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
