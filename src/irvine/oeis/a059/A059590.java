package irvine.oeis.a059;

import irvine.oeis.a000.A000142;
import irvine.oeis.closure.DistinctAdditiveClosureSequence;

/**
 * A059590 Numbers obtained by reinterpreting base-2 representation of n in the factorial base: a(n) = Sum_{k&gt;=0} A030308(n,k)*A000142(k+1).
 * @author Sean A. Irvine
 */
public class A059590 extends DistinctAdditiveClosureSequence {

  /** Construct the sequence. */
  public A059590() {
    super(0, new A000142().skip(1));
  }
}
