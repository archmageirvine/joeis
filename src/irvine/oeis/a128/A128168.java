package irvine.oeis.a128;

/**
 * A128168 Numbers n such that n divides <code>1 +</code> Sum[ Prime[k]^4, {k,1,n} <code>] = 1 +</code> A122102(n).
 * @author Sean A. Irvine
 */
public class A128168 extends A128171 {

  @Override
  protected int power() {
    return 4;
  }
}
