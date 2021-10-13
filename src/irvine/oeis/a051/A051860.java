package irvine.oeis.a051;

import irvine.oeis.DistinctSequence;

/**
 * A051860 Prime numbers in order of their appearance in A051686.
 * @author Sean A. Irvine
 */
public class A051860 extends DistinctSequence {

  /** Construct the sequence. */
  public A051860() {
    super(new A051686());
  }
}
