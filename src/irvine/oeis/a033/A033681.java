package irvine.oeis.a033;

/**
 * A033681 a(1) = 3; a(n) is smallest number &gt;= a(n-1) such that the juxtaposition a(1)a(2)...a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A033681 extends A033680 {

  @Override
  protected long start() {
    return 3;
  }
}
