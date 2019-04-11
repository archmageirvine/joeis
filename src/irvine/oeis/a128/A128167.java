package irvine.oeis.a128;

/**
 * A128167 Numbers n such that n divides <code>1 +</code> Sum[ Prime[k]^3, <code>{k,1,n} ] = 1 +</code> A098999(n).
 * @author Sean A. Irvine
 */
public class A128167 extends A128171 {

  @Override
  protected int power() {
    return 3;
  }
}
