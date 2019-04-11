package irvine.oeis.a015;

/**
 * A015509 <code>a(1)=1, a(n) =</code> sum_{k=1}^{k=n-1} (8^k-1)/7 a(k).
 * @author Sean A. Irvine
 */
public class A015509 extends A015502 {

  @Override
  protected int q() {
    return 8;
  }
}
