package irvine.oeis.a046;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a039.A039999;

/**
 * A046891 Values of n where number of permutations of digits a(n) that are prime increases.
 * @author Sean A. Irvine
 */
public class A046891 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A046891() {
    super(1, new A039999(), 1);
  }
}
