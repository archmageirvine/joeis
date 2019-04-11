package irvine.oeis.a015;

/**
 * A015499 <code>a(0)=1, a(1)=11, a(n) =</code> sum_{k=0}^{k=n-1} 11^k a(k).
 * @author Sean A. Irvine
 */
public class A015499 extends A015487 {

  @Override
  protected int q() {
    return 11;
  }
}
