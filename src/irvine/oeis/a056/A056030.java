package irvine.oeis.a056;

import irvine.oeis.a042.A042974;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A056030 Continued fraction for 0.12112111211112... (A042974).
 * @author Sean A. Irvine
 */
public class A056030 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A056030() {
    super(new A042974());
  }
}
