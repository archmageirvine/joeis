package irvine.oeis.a128;

/**
 * A128167 Numbers k such that k divides 1 + Sum_{j=1..k} prime(j)^3 = 1 + A098999(k).
 * @author Sean A. Irvine
 */
public class A128167 extends A128171 {

  @Override
  protected int power() {
    return 3;
  }
}
