package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026566 <code>a(n) = Sum{T(i,j)}, 0&lt;=j&lt;=i, 0&lt;=i&lt;=n</code>, T given by <code>A026552</code>.
 * @author Sean A. Irvine
 */
public class A026566 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026566() {
    super(new A026564());
  }
}
