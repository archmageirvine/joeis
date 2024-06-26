package irvine.oeis.a320;
// Generated by gen_seq4.pl 2024-05-08/invtras at 2024-05-08 21:31

import irvine.oeis.a001.A001227;
import irvine.oeis.transform.InvertTransform;

/**
 * A320650 Expansion of 1/(1 - Sum_{k&gt;=1} x^k/(1 - x^(2*k))).
 * @author Georg Fischer
 */
public class A320650 extends InvertTransform {

  /** Construct the sequence. */
  public A320650() {
    super(0, new A001227(), 0);
  }
}
