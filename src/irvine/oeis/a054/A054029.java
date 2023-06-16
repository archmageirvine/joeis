package irvine.oeis.a054;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A054029 First differences of A054028.
 * @author Sean A. Irvine
 */
public class A054029 extends DifferenceSequence {

  /** Construct the sequence. */
  public A054029() {
    super(1, new PrependSequence(new A054028(), 0));
  }
}

