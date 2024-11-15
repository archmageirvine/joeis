package irvine.oeis.a073;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000796;

/**
 * A073055 a(n) = product of first n digits in the decimal expansion of Pi, ignoring decimal point.
 * @author Sean A. Irvine
 */
public class A073055 extends PartialProductSequence {

  /** Construct the sequence. */
  public A073055() {
    super(0, new PrependSequence(new A000796(), 1));
  }
}
