package irvine.oeis.a031;

/**
 * A031170 a(n) = prime(n+8) - prime(n).
 * @author Sean A. Irvine
 */
public class A031170 extends A031169 {

  @Override
  protected int shift() {
    return 8;
  }
}
