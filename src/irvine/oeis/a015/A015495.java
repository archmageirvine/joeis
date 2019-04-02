package irvine.oeis.a015;

/**
 * A015495 a(0)=1, a(1)=7, a(n) = sum_{k=0}^{k=n-1} 7^k a(k).
 * @author Sean A. Irvine
 */
public class A015495 extends A015487 {

  @Override
  protected int q() {
    return 7;
  }
}
