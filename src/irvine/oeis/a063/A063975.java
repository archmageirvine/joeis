package irvine.oeis.a063;

import irvine.oeis.InverseSequence;

/**
 * A063975 Smallest numbers such that the number of terms in inverse set usigma equals n; where usigma = A034448.
 * @author Sean A. Irvine
 */
public class A063975 extends InverseSequence {

  /** Construct the sequence. */
  public A063975() {
    super(new A063974());
  }
}
