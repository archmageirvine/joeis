package irvine.oeis.a015;

/**
 * A015507 <code>a(1)=1, a(n) = sum_{k=1}^{k=n-1} (6^k-1)/5 a(k)</code>.
 * @author Sean A. Irvine
 */
public class A015507 extends A015502 {

  @Override
  protected int q() {
    return 6;
  }
}
