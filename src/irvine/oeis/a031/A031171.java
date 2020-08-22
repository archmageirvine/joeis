package irvine.oeis.a031;

/**
 * A031171 a(n) = prime(n+9) - prime(n).
 * @author Sean A. Irvine
 */
public class A031171 extends A031169 {

  @Override
  protected int shift() {
    return 9;
  }
}
