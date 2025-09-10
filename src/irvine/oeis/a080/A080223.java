package irvine.oeis.a080;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.RecordSequence;
import irvine.oeis.a051.A051788;

/**
 * A080223 Record-setting differences between adjacent elements of the Mian-Chowla sequence variant A051788.
 * @author Sean A. Irvine
 */
public class A080223 extends RecordSequence {

  /** Construct the sequence. */
  public A080223() {
    super(1, new DifferenceSequence(new A051788()));
  }
}

