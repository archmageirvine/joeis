package irvine.oeis.a069;
// Generated by gen_seq4.pl dirichcon2 at 2021-04-24 00:16
// DO NOT EDIT here!

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a000.A000290;

/**
 * A069097 Moebius transform of A064987, n*sigma(n).
 * @author Georg Fischer
 */
public class A069097 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A069097() {
    super(new A000290(), 0, new A000010(), 1);
  }
}
