package irvine.oeis.a015;

/**
 * A015515 <code>a(1)=1, a(n) = sum_{k=1}^{k=n-1} (12^k-1)/11 a(k)</code>.
 * @author Sean A. Irvine
 */
public class A015515 extends A015502 {

  @Override
  protected int q() {
    return 12;
  }
}
