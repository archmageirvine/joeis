package irvine.oeis.a087;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a068.A068632;

/**
 * A399911.
 * @author Sean A. Irvine
 */
public class A087379 extends PartialSumSequence {

  /** Construct the sequence. */
  public A087379() {
    super(0, new A068632());
  }
}
