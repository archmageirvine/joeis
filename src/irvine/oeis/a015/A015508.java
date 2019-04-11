package irvine.oeis.a015;

/**
 * A015508 <code>a(1)=1, a(n) =</code> sum_{k=1}^{k=n-1} <code>(7^k-1)/6 a(k)</code>.
 * @author Sean A. Irvine
 */
public class A015508 extends A015502 {

  @Override
  protected int q() {
    return 7;
  }
}
