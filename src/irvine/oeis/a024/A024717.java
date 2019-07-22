package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002870;

/**
 * A024717 Sum of <code>max{S(i,j): 1&lt;=j&lt;=i}</code> for i <code>= 1,2,...,n</code>, where <code>S(i,j)</code> are Stirling numbers of the second kind.
 * @author Sean A. Irvine
 */
public class A024717 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024717() {
    super(new A002870());
  }
}
