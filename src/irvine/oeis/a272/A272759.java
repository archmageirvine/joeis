package irvine.oeis.a272;
// Generated by gen_seq4.pl tuptraf/simtraf at 2023-10-28 00:07

import irvine.oeis.a065.A065879;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A272759 a(n) = A065879(n)/n.
 * @author Georg Fischer
 */
public class A272759 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A272759() {
    super(1, new A065879(), (n, v) -> v.divide(n));
  }
}
