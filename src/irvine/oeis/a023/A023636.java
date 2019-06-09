package irvine.oeis.a023;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A023636.
 * @author Sean A. Irvine
 */
public class A023636 extends DifferenceSequence {

  /** Construct the sequence. */
  public A023636() {
    super(new PrependSequence(new A023635(), 0));
  }
}
