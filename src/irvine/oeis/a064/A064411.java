package irvine.oeis.a064;

import irvine.oeis.RecordSequence;
import irvine.oeis.a094.A094644;

/**
 * A064411 Increasing partial quotients of e^gamma.
 * @author Sean A. Irvine
 */
public class A064411 extends RecordSequence {

  /** Construct the sequence. */
  public A064411() {
    super(new A094644());
  }
}

