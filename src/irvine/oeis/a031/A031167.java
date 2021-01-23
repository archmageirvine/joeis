package irvine.oeis.a031;

/**
 * A031167 a(n) = prime(n+5) - prime(n).
 * @author Sean A. Irvine
 */
public class A031167 extends A031169 {

  @Override
  protected int shift() {
    return 5;
  }
}
