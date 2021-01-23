package irvine.oeis.a015;

/**
 * A015501 a(0)=1, a(1)=12, a(n) = sum_{k=0}^{k=n-1} 12^k a(k).
 * @author Sean A. Irvine
 */
public class A015501 extends A015487 {

  @Override
  protected int q() {
    return 12;
  }
}
