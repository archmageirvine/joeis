package irvine.oeis.a015;

/**
 * A015497 <code>a(0)=1, a(1)=9, a(n) =</code> sum_{k=0}^{k=n-1} 9^k a(k).
 * @author Sean A. Irvine
 */
public class A015497 extends A015487 {

  @Override
  protected int q() {
    return 9;
  }
}
