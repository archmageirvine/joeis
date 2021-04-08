package irvine.oeis.a111;

import irvine.oeis.a033.A033680;

/**
 * A111524 a(1) = 10; a(n) is smallest number &gt;= a(n-1) such that the juxtaposition a(1)a(2)...a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A111524 extends A033680 {

  @Override
  protected long start() {
    return 10;
  }
}
