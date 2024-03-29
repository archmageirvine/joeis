package irvine.oeis.a238;
// Generated by ./gen_seq4.pl /diffseq0 at 2022-06-26 10:36

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001614;

/**
 * A238303 Triangle T(n,k), 0&lt;=k&lt;=n, read by rows given by T(n,0) = 1, T(n,k) = 2 if k&gt;0.
 * @author Sean A. Irvine
 */
public class A238303 extends DifferenceSequence {

  /** Construct the sequence. */
  public A238303() {
    super(new PrependSequence(new A001614(), 0));
  }
}
