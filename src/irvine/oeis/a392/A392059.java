package irvine.oeis.a392;

import irvine.oeis.PartialProductSequence;

/**
 * A392059 a(n) is the product of all p^k such that p is a ramified or inert prime in the Gaussian integers and k is the largest such k satisfying p^k &lt;= n.
 * @author Sean A. Irvine
 */
public class A392059 extends PartialProductSequence {

  /** Construct the sequence. */
  public A392059() {
    super(new A392055());
  }
}
