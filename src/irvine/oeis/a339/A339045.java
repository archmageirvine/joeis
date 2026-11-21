package irvine.oeis.a339;

import irvine.oeis.gf.GfSequence;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A339045 Number of connected loopless multigraphs with n edges rooted at two noninterchangeable vertices whose removal leaves a connected graph.
 * @author Gregory Morse
 */
public class A339045 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A339045() {
    super(1, new GfSequence(1, A339042.gf(true)));
  }
}
