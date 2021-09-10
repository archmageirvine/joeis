package irvine.oeis.a051;

import irvine.oeis.PositionOfNSequence;
import irvine.oeis.a002.A002321;

/**
 * A051400 Smallest value of x such that M(x) = n, where M() is Mertens's function A002321.
 * @author Sean A. Irvine
 */
public class A051400 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A051400() {
    super(new A002321());
  }
}
