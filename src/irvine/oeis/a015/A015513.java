package irvine.oeis.a015;

/**
 * A015513 <code>a(1)=1, a(n) = sum_{k=1}^{k=n-1} (11^k-1)/10 a(k)</code>.
 * @author Sean A. Irvine
 */
public class A015513 extends A015502 {

  @Override
  protected int q() {
    return 11;
  }
}
