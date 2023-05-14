package irvine.oeis.a015;

/**
 * A015512 a(1) = 1, a(n) = Sum_{k=1..n-1} ((10^k - 1)/9)*a(k).
 * @author Sean A. Irvine
 */
public class A015512 extends A015502 {

  @Override
  protected int q() {
    return 10;
  }
}
