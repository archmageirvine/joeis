package irvine.oeis.a015;

/**
 * A015515 a(1) = 1, a(n) = Sum_{k=1..n-1} ((12^k - 1)/11)*a(k).
 * @author Sean A. Irvine
 */
public class A015515 extends A015502 {

  @Override
  protected int q() {
    return 12;
  }
}
