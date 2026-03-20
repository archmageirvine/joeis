package irvine.oeis.a394;

import irvine.oeis.Combiner;
import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a004.A004164;
import irvine.oeis.a007.A007953;

/**
 * A394108 Numbers k that set a new record for A007953(k) - A004164(k).
 * @author Sean A. Irvine
 */
public class A394108 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A394108() {
    super(1, new Combiner(1, new A007953().skip(), new A004164().skip(), Combiner.SUBTRACT), 1, false);
  }
}
