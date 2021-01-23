package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a015.A015220;

/**
 * A014796 Squares of even tetrahedral numbers (A015220).
 * @author Sean A. Irvine
 */
public class A014796 extends A015220 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
