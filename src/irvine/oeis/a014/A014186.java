package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A014186 Squares of palindromes.
 * @author Sean A. Irvine
 */
public class A014186 extends A002113 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
