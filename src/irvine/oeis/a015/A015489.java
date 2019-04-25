package irvine.oeis.a015;

/**
 * A015489 <code>a(0)=1, a(1)=4, a(n) = sum_{k=0}^{k=n-1} 4^k a(k)</code>.
 * @author Sean A. Irvine
 */
public class A015489 extends A015487 {

  @Override
  protected int q() {
    return 4;
  }
}
