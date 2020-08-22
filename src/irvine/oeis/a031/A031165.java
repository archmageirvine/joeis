package irvine.oeis.a031;

/**
 * A031165 a(n) = prime(n+3) - prime(n).
 * @author Sean A. Irvine
 */
public class A031165 extends A031169 {

  @Override
  protected int shift() {
    return 3;
  }
}
