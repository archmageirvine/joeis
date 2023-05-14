package irvine.oeis.a015;

/**
 * A015513 a(1) = 1, a(n) = Sum_{k=1..n-1} ((11^k - 1)/10)*a(k).
 * @author Sean A. Irvine
 */
public class A015513 extends A015502 {

  @Override
  protected int q() {
    return 11;
  }
}
