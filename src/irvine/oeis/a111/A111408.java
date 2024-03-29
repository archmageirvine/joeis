package irvine.oeis.a111;
// Generated by ./gen_seq4.pl /diffseq0 at 2022-06-26 10:36

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a051.A051027;

/**
 * A111408 f(f(n+1))-f(f(n)), where f(0)=0, and for m&gt;0, f(m) = sigma(m) = A000203(m).
 * @author Sean A. Irvine
 */
public class A111408 extends DifferenceSequence {

  /** Construct the sequence. */
  public A111408() {
    super(new PrependSequence(new A051027(), 0));
  }
}
