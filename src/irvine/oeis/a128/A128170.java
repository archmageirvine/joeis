package irvine.oeis.a128;

/**
 * A128170 Numbers k such that k divides 1 + Sum_{j=1..k} prime(j)^6.
 * @author Sean A. Irvine
 */
public class A128170 extends A128171 {

  @Override
  protected int power() {
    return 6;
  }
}
