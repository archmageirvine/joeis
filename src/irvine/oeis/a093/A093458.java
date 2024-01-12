package irvine.oeis.a093;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a073.A073846;

/**
 * A093458 Partial products of A073846.
 * @author Georg Fischer
 */
public class A093458 extends PartialProductSequence {

  /** Construct the sequence. */
  public A093458() {
    super(1, new A073846());
  }
}
