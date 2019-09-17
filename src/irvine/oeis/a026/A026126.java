package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005325;

/**
 * A026126.
 * @author Sean A. Irvine
 */
public class A026126 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026126() {
    super(new PrependSequence(new DifferenceSequence(new PrependSequence(new A005325(), 0)), 0));
  }
}
