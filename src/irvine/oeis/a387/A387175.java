package irvine.oeis.a387;

import irvine.oeis.a238.A238695;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A387175 Continued fraction expansion of Product_{k&gt;=0} (1+1/k!).
 * @author Sean A. Irvine
 */
public class A387175 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A387175() {
    super(0, new A238695());
  }
}

