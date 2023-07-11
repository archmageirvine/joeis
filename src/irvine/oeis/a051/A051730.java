package irvine.oeis.a051;

import irvine.oeis.RecordSequence;

/**
 * A051730 Distance from A051650(n) to nearest prime.
 * @author Sean A. Irvine
 */
public class A051730 extends RecordSequence {

  /** Construct the sequence. */
  public A051730() {
    super(0, new A051700());
  }
}
