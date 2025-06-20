package irvine.oeis.a305;
// Generated by gen_seq4.pl 2025-06-01.ack/invtraf at 2025-06-01 21:15

import irvine.oeis.a002.A002105;
import irvine.oeis.transform.InvertTransform;

/**
 * A305533 Expansion of 1/(1 - x/(1 - 1*x/(1 - 3*x/(1 - 6*x/(1 - 10*x/(1 - ... - (k*(k + 1)/2)*x/(1 - ...))))))), a continued fraction.
 * @author Georg Fischer
 */
public class A305533 extends InvertTransform {

  /** Construct the sequence. */
  public A305533() {
    super(0, new A002105());
  }
}
