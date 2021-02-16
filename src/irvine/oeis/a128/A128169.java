package irvine.oeis.a128;

/**
 * A128169 Numbers k such that k divides 1 + Sum_{j=1..k} prime(j)^5 = 1 + A122103(k).
 * @author Sean A. Irvine
 */
public class A128169 extends A128171 {

  @Override
  protected int power() {
    return 5;
  }
}
