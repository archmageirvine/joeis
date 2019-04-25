package irvine.oeis.a015;

/**
 * A015506 <code>a(1)=1, a(n) = sum_{k=1}^{k=n-1} (5^k-1)/4 a(k)</code>.
 * @author Sean A. Irvine
 */
public class A015506 extends A015502 {

  @Override
  protected int q() {
    return 5;
  }
}
