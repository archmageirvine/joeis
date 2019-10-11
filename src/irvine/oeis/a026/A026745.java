package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026745 <code>a(n) = Sum_{j=0..n} Sum_{i=0..n} T(j,i)</code>, T given by <code>A026736</code>.
 * @author Sean A. Irvine
 */
public class A026745 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026745() {
    super(new A026743());
  }
}
