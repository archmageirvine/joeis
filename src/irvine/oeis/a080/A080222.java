package irvine.oeis.a080;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.RecordSequence;
import irvine.oeis.a005.A005282;

/**
 * A080222 Record-setting differences between adjacent elements of the Mian-Chowla sequence A005282.
 * @author Sean A. Irvine
 */
public class A080222 extends RecordSequence {

  /** Construct the sequence. */
  public A080222() {
    super(1, new DifferenceSequence(new A005282()));
  }
}

