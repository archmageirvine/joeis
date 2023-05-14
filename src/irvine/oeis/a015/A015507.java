package irvine.oeis.a015;

/**
 * A015507 a(1) = 1, a(n) = Sum_{k=1..n-1} ((6^k - 1)/5)*a(k).
 * @author Sean A. Irvine
 */
public class A015507 extends A015502 {

  @Override
  protected int q() {
    return 6;
  }
}
