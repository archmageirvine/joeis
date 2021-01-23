package irvine.oeis.a027;

import irvine.oeis.PartialSumSequence;

/**
 * A027915 a(n) = Sum_{0&lt;=j&lt;=i, 0&lt;=i&lt;=n} A027907(i, j).
 * @author Sean A. Irvine
 */
public class A027915 extends PartialSumSequence {

  /** Construct the sequence. */
  public A027915() {
    super(new A027914());
  }
}
