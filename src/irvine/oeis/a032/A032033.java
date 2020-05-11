package irvine.oeis.a032;

import irvine.oeis.Stirling2TransformSequence;

/**
 * A032033 Stirling transform of <code>A032031</code>.
 * @author Sean A. Irvine
 */
public class A032033 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A032033() {
    super(new A032031(), 0);
  }
}
