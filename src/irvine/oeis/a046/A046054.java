package irvine.oeis.a046;

import irvine.oeis.RecordSequence;
import irvine.oeis.a000.A000688;

/**
 * A046054 Incrementally largest number of nonisomorphic finite Abelian groups as a function of order.
 * @author Sean A. Irvine
 */
public class A046054 extends RecordSequence {

  /** Construct the sequence. */
  public A046054() {
    super(new A000688());
  }
}
