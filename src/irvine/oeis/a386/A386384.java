package irvine.oeis.a386;

import irvine.oeis.a387.A387268;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A386384 Continued fraction expansion of Sum_{k&gt;=0} (-1)^k/(k!)!.
 * @author Sean A. Irvine
 */
public class A386384 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A386384() {
    super(0, new A387268());
  }
}

