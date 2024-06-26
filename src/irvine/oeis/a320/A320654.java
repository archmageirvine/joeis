package irvine.oeis.a320;
// Generated by gen_seq4.pl 2024-05-08/invtras at 2024-05-08 21:31

import irvine.oeis.a015.A015128;
import irvine.oeis.transform.InvertTransform;

/**
 * A320654 Expansion of 1/(2 - Product_{k&gt;=1} (1 + x^k)/(1 - x^k)).
 * @author Georg Fischer
 */
public class A320654 extends InvertTransform {

  /** Construct the sequence. */
  public A320654() {
    super(0, new A015128(), 0);
  }
}
