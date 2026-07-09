package irvine.oeis.a085;

import irvine.oeis.a000.A000035;
import irvine.oeis.a057.A057979;
import irvine.oeis.transform.DelehamDeltaSequence;

/**
 * A085768.
 * @author Sean A. Irvine
 */
public class A085791 extends DelehamDeltaSequence {

  /** Construct the sequence. */
  public A085791() {
    super(new A000035(), new A057979());
  }
}
