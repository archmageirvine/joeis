package irvine.oeis.a015;

/**
 * A015498 <code>a(0)=1, a(1)=10, a(n) =</code> sum_{k=0}^{k=n-1} 10^k a(k).
 * @author Sean A. Irvine
 */
public class A015498 extends A015487 {

  @Override
  protected int q() {
    return 10;
  }
}
