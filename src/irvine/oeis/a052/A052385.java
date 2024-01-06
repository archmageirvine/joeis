package irvine.oeis.a052;

import irvine.math.cr.CR;
import irvine.oeis.EgyptianFractionSequence;

/**
 * A052385 a(n)*10^n are the denominators of the greedy alternating Egyptian fraction expansion of Pi - 3 of the form Sum_{n&gt;=0} (-1)^n / (a(n)*10^n).
 * @author Sean A. Irvine
 */
public class A052385 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A052385() {
    super(CR.PI.subtract(CR.THREE), EgyptianFractionSequence.ALTERNATE_SIGNS_PLUS);
  }
}
