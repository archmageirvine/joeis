package irvine.oeis.a015;

/**
 * A015503 <code>a(1)=1, a(n) =</code> sum_{k=1}^{k=n-1} (4^k-1)/3 a(k).
 * @author Sean A. Irvine
 */
public class A015503 extends A015502 {

  @Override
  protected int q() {
    return 4;
  }
}
