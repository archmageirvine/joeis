package irvine.oeis.a025;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a014.A014531;

/**
 * A025180.
 * @author Sean A. Irvine
 */
public class A025180 extends DifferenceSequence {

  /** Construct the sequence. */
  public A025180() {
    super(new PrependSequence(new A014531(), 0));
  }
}
