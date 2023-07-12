package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A014188 Fourth powers of palindromes.
 * @author Sean A. Irvine
 */
public class A014188 extends A002113 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return super.next().pow(4);
  }
}
