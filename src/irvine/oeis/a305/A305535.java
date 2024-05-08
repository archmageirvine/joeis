package irvine.oeis.a305;
// manually 2024-05-04/invtrac at 2024-05-08 10:11

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000165;
import irvine.oeis.transform.InvertTransform;

/**
 * A305535 Expansion of 1/(1 - x/(1 - 2*x/(1 - 2*x/(1 - 4*x/(1 - 4*x/(1 - 6*x/(1 - 6*x/(1 - ...)))))))), a continued fraction.
 * @author Georg Fischer
 */
public class A305535 extends InvertTransform {

  /** Construct the sequence. */
  public A305535() {
    super(0, new PrependSequence(new A000165(), 0), 0, 0);
  }
}
