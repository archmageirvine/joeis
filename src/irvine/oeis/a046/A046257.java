package irvine.oeis.a046;

import irvine.oeis.a033.A033680;

/**
 * A046257 a(1) = 7; a(n) is smallest number &gt;= a(n-1) such that the juxtaposition a(1)a(2)...a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A046257 extends A033680 {

  @Override
  protected long start() {
    return 7;
  }
}
