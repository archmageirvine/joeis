package irvine.oeis.a061;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a060.A060984;

/**
 * A061859.
 * @author Sean A. Irvine
 */
public class A061886 extends DifferenceSequence {

  /** Construct the sequence. */
  public A061886() {
    super(new PrependSequence(new A060984(), 0));
  }
}
