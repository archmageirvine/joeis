package irvine.oeis.a378;

import irvine.oeis.PrependSequence;
import irvine.oeis.a037.A037293;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A378302 Number of nondegenerate balanced Boolean functions of n variables.
 * @author Gregory Morse
 */
public class A378302 extends InverseBinomialTransformSequence {
  /** Construct the sequence. */
  public A378302() {
    super(0, new PrependSequence(0, new A037293().skip(1), 0), 0);
  }
}
