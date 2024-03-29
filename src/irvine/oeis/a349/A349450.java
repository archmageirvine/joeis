package irvine.oeis.a349;
// Generated by gen_seq4.pl deris/dirichinv at 2022-10-26 15:17
// DO NOT EDIT here!

import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a000.A000108;

/**
 * A349450 Dirichlet inverse of right-shifted Catalan numbers [as when started from A000108(0): 1, 1, 2, 5, 14, 42, etc.].
 * @author Georg Fischer
 */
public class A349450 extends DirichletInverseSequence {

  /** Construct the sequence. */
  public A349450() {
    super(new A000108());
  }
}
