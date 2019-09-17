package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A026124.
 * @author Sean A. Irvine
 */
public class A026124 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026124() {
    super(new PrependSequence(new A026109(), 0));
  }
}
