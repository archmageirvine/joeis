package irvine.oeis.a128;

/**
 * A128169 Numbers n such that n divides 1 + Sum[ Prime[k]^5, {k,1,n} ] = 1 + A122103(n).
 * @author Sean A. Irvine
 */
public class A128169 extends A128171 {

  @Override
  protected int power() {
    return 5;
  }
}
