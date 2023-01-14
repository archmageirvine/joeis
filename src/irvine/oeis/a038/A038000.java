package irvine.oeis.a038;

import irvine.oeis.SkipSequence;
import irvine.oeis.ZeroSpacedSequence;
import irvine.oeis.a000.A000081;
import irvine.oeis.transform.EulerTransform;

/**
 * A038000 Number of forests of rooted trees where n dollars are spent and an n-node tree costs 2n-1 dollars.
 * @author Sean A. Irvine
 */
public class A038000 extends EulerTransform {

  /** Construct the sequence. */
  public A038000() {
    super(1, new SkipSequence(new ZeroSpacedSequence(new A000081(), 1), 2));
  }
}
