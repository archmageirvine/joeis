package irvine.oeis.a094;

import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002898;
import irvine.oeis.transform.InverseInvertTransform;

/**
 * A094060 Number of walks of length n on hexagonal grid that start and end at the origin. Intermediate returns to the origin are not permitted.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A094060 extends PrependSequence {

  /** Construct the sequence. */
  public A094060() {
    super(new InverseInvertTransform(0, new A002898(), 1), 1);
  }
}
