package irvine.oeis.a033;

/**
 * A033679 a(1) = 2; a(n) is smallest number &gt;= a(n-1) such that the juxtaposition a(1)a(2)...a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A033679 extends A033680 {

  @Override
  protected long start() {
    return 2;
  }
}
