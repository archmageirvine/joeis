package irvine.oeis.a128;

/**
 * A128168 Numbers k such that k divides 1 + Sum_{j=1..k} prime(j)^4 = 1 + A122102(k).
 * @author Sean A. Irvine
 */
public class A128168 extends A128171 {

  @Override
  protected int power() {
    return 4;
  }
}
