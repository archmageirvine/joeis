package irvine.oeis.a015;

/**
 * A015495 <code>a(0)=1, a(1)=7, a(n) =</code> sum_{k=0}^{k=n-1} <code>7^k a(k)</code>.
 * @author Sean A. Irvine
 */
public class A015495 extends A015487 {

  @Override
  protected int q() {
    return 7;
  }
}
