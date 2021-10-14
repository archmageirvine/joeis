package irvine.oeis.a051;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a052.A052333;

/**
 * A051914 Values of n at which record values in A052334 are reached.
 * @author Sean A. Irvine
 */
public class A051914 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A051914() {
    super(new A052333(), 1);
  }
}
