package irvine.oeis.a242;
// Generated by gen_seq4.pl 2024-02-26/simtraf at 2024-02-26 19:18

import irvine.oeis.a009.A009454;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A242652 Imaginary part of Product_{k=0..n} (i-k), where i=sqrt(-1).
 * @author Georg Fischer
 */
public class A242652 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A242652() {
    super(0, new A009454().skip(1), v -> v);
  }
}
