package irvine.oeis.a035;

import irvine.oeis.WeighTransformSequence;
import irvine.oeis.a000.A000055;

/**
 * A035055 Number of forests of different trees.
 * @author Sean A. Irvine
 */
public class A035055 extends WeighTransformSequence {

  /** Construct the sequence. */
  public A035055() {
    super(new A000055());
  }
}
