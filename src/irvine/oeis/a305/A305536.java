package irvine.oeis.a305;
// manually 2024-05-04/invtrac at 2024-05-08 10:23

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001515;
import irvine.oeis.transform.InvertTransform;

/**
 * A305536 Expansion of 1/(1 - x/(1 - x - 1*x/(1 - x - 2*x/(1 - x - 3*x/(1 - x - 4*x/(1 - ...)))))), a continued fraction.
 * @author Georg Fischer
 */
public class A305536 extends InvertTransform {

  /** Construct the sequence. */
  public A305536() {
    super(0, new PrependSequence(new A001515(), 0), 0, 0);
  }
}
