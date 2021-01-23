package irvine.oeis.a015;

/**
 * A015490 a(0)=1, a(1)=5, a(n) = sum_{k=0}^{k=n-1} 5^k a(k).
 * @author Sean A. Irvine
 */
public class A015490 extends A015487 {

  @Override
  protected int q() {
    return 5;
  }
}
