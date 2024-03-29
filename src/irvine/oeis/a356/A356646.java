package irvine.oeis.a356;
// Generated by gen_seq4.pl 2023-09-08/filtpos at 2023-09-08 15:21

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a025.A025281;

/**
 * A356646 Numbers k such that the integer log of k! is a perfect power.
 * @author Georg Fischer
 */
public class A356646 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A356646() {
    super(1, 0, new A025281(), v -> v.isPower() != null);
  }
}
