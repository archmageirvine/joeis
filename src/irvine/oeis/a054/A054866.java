package irvine.oeis.a054;

import irvine.oeis.RecordSequence;
import irvine.oeis.a002.A002211;

/**
 * A054866 Incrementally largest terms in the continued fraction for Khinchin's constant.
 * @author Sean A. Irvine
 */
public class A054866 extends RecordSequence {

  /** Construct the sequence. */
  public A054866() {
    super(new A002211());
  }
}
