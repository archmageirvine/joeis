package irvine.oeis.a051;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000005;

/**
 * A051951 Second differences of tau(n).
 * @author Sean A. Irvine
 */
public class A051951 extends DifferenceSequence {

  /** Construct the sequence. */
  public A051951() {
    super(new DifferenceSequence(new PrependSequence(new A000005(), 0)));
  }
}
