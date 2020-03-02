package irvine.oeis.a029;

import irvine.oeis.DistinctSequence;

/**
 * A029660 Distinct odd numbers in <code>(2,1)-Pascal</code> triangle <code>A029653</code>.
 * @author Sean A. Irvine
 */
public class A029660 extends DistinctSequence {

  /** Construct the sequence. */
  public A029660() {
    super(new A029669());
  }
}
