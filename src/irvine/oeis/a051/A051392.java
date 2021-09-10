package irvine.oeis.a051;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a052.A052006;

/**
 * A051392 First differences of A052006.
 * @author Sean A. Irvine
 */
public class A051392 extends DifferenceSequence {

  /** Construct the sequence. */
  public A051392() {
    super(new A052006());
  }
}

