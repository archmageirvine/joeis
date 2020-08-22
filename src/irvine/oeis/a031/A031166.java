package irvine.oeis.a031;

/**
 * A031166 a(n) = prime(n+4) - prime(n).
 * @author Sean A. Irvine
 */
public class A031166 extends A031169 {

  @Override
  protected int shift() {
    return 4;
  }
}
