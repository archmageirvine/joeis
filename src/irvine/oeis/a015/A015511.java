package irvine.oeis.a015;

/**
 * A015511 <code>a(1)=1, a(n) =</code> sum_{k=1}^{k=n-1} <code>(9^k-1)/8 a(k)</code>.
 * @author Sean A. Irvine
 */
public class A015511 extends A015502 {

  @Override
  protected int q() {
    return 9;
  }
}
