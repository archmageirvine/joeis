package irvine.oeis.a080;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.RecordSequence;
import irvine.oeis.a058.A058335;

/**
 * A080931 Record-setting differences between adjacent elements of the Mian-Chowla sequence variant A058335.
 * @author Sean A. Irvine
 */
public class A080931 extends RecordSequence {

  /** Construct the sequence. */
  public A080931() {
    super(1, new DifferenceSequence(new A058335()));
  }
}

