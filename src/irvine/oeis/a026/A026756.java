package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;

/**
 * A026756 <code>a(n) = Sum_{i=0..n} Sum_{j=0..n} T(i,j)</code>, T given by <code>A026747</code>.
 * @author Sean A. Irvine
 */
public class A026756 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026756() {
    super(new A026754());
  }
}
