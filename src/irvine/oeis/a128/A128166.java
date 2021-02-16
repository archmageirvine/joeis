package irvine.oeis.a128;

/**
 * A128166 Numbers k such that k divides 1 + Sum_{j=1..k} prime(j)^2 = 1 + A024450(k).
 * @author Sean A. Irvine
 */
public class A128166 extends A128171 {

  @Override
  protected int power() {
    return 2;
  }
}
