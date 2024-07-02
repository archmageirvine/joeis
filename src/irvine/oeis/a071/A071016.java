package irvine.oeis.a071;

import irvine.oeis.a002.A002487;
import irvine.oeis.transform.Stirling2TransformSequence;

/**
 * A071016 Stirling_2 transform of A002487.
 * @author Sean A. Irvine
 */
public class A071016 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A071016() {
    super(1, new A002487(), 1);
    next();
  }
}
