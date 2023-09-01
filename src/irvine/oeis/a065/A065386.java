package irvine.oeis.a065;

import irvine.oeis.RecordSequence;
import irvine.oeis.a051.A051953;

/**
 * A065386 Successive record values of the cototient function (A051953).
 * @author Sean A. Irvine
 */
public class A065386 extends RecordSequence {

  /** Construct the sequence. */
  public A065386() {
    super(new A051953());
  }
}
