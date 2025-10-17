package irvine.oeis.a081;

import irvine.oeis.PartialSumSequence;

/**
 * A081260 a(1)=4; for n&gt;1, a(n) is taken to be the third-smallest integer greater than a(n-1) such that the condition "n is a member of the sequence if and only if a(n) is odd" is satisfied.
 * @author Sean A. Irvine
 */
public class A081260 extends PartialSumSequence {

  /** Construct the sequence. */
  public A081260() {
    super(1, new A081261());
  }
}
