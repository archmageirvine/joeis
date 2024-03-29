package irvine.oeis.a330;
// Generated by gen_seq4.pl robot/partsum at 2023-05-04 21:32

import irvine.oeis.PartialSumSequence;

/**
 * A330324 a(n) = Sum_{i=1..n} Moebius(i)*Moebius(i+1), where Moebius(n) = A008683(n).
 * @author Georg Fischer
 */
public class A330324 extends PartialSumSequence {

  /** Construct the sequence. */
  public A330324() {
    super(1, new A330323());
  }
}
