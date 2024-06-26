package irvine.oeis.a307;
// Generated by gen_seq4.pl 2024-05-08/invtras at 2024-05-08 21:31

import irvine.oeis.a001.A001615;
import irvine.oeis.transform.InvertTransform;

/**
 * A307073 Expansion of 1/(1 - Sum_{k&gt;=1} mu(k)^2*x^k/(1 - x^k)^2).
 * @author Georg Fischer
 */
public class A307073 extends InvertTransform {

  /** Construct the sequence. */
  public A307073() {
    super(0, new A001615(), 0);
  }
}
