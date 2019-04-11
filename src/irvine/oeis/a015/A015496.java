package irvine.oeis.a015;

/**
 * A015496 <code>a(0)=1, a(1)=8, a(n) =</code> sum_{k=0}^{k=n-1} 8^k a(k).
 * @author Sean A. Irvine
 */
public class A015496 extends A015487 {

  @Override
  protected int q() {
    return 8;
  }
}
