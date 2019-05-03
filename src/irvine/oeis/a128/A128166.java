package irvine.oeis.a128;

/**
 * A128166 Numbers n such that n divides <code>1 + Sum[ Prime[k]^2, {k,1,n} ] = 1 + A024450(n)</code>.
 * @author Sean A. Irvine
 */
public class A128166 extends A128171 {

  @Override
  protected int power() {
    return 2;
  }
}
