package irvine.oeis.a064;

import irvine.oeis.RecordSequence;
import irvine.oeis.a063.A063504;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A064441 Increasing partial quotients of e^Pi - Pi^e (A063504).
 * @author Sean A. Irvine
 */
public class A064441 extends RecordSequence {

  /** Construct the sequence. */
  public A064441() {
    super(new ContinuedFractionSequence(new A063504()).skip());
  }
}
