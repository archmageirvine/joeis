package irvine.oeis.a033;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.PartialSumSequence;

/**
 * A033944 Compare partial sums of A033881 and A033884; this is the sequence of common terms.
 * @author Sean A. Irvine
 */
public class A033944 extends IntersectionSequence {

  /** Construct the sequence. */
  public A033944() {
    super(new PartialSumSequence(new A033881()), new PartialSumSequence(new A033884()));
  }
}
