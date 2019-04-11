package irvine.oeis.a015;

/**
 * A015492 <code>a(0)=1, a(1)=6, a(n) =</code> sum_{k=0}^{k=n-1} 6^k a(k).
 * @author Sean A. Irvine
 */
public class A015492 extends A015487 {

  @Override
  protected int q() {
    return 6;
  }
}
