package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-04-28.ack/partprod at 2025-04-28 23:36

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a217.A217562;

/**
 * A383227 a(n) is the product of first n even numbers not divisible by 5 (cf. A217562).
 * @author Georg Fischer
 */
public class A383227 extends PartialProductSequence {

  /** Construct the sequence. */
  public A383227() {
    super(0, new PrependSequence(0, new A217562(), 1));
  }
}
