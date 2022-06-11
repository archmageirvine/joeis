package irvine.oeis.a057;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a055.A055462;

/**
 * A057527 4th level factorials: product of first n superduperfactorials.
 * @author Sean A. Irvine
 */
public class A057527 extends PartialProductSequence {

  /** Construct the sequence. */
  public A057527() {
    super(new A055462());
  }
}
