package irvine.oeis.a015;

/**
 * A015508 a(1)=1, a(n) = sum_{k=1}^{k=n-1} (7^k-1)/6 a(k).
 * @author Sean A. Irvine
 */
public class A015508 extends A015502 {

  @Override
  protected int q() {
    return 7;
  }
}
