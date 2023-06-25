package irvine.oeis.a064;

import irvine.oeis.RecordSequence;
import irvine.oeis.a057.A057167;

/**
 * A064227 From Recam\u00e1n's sequence (A005132): record values in A057167.
 * @author Sean A. Irvine
 */
public class A064227 extends RecordSequence {

  /** Construct the sequence. */
  public A064227() {
    super(new A057167());
  }
}
