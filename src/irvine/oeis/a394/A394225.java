package irvine.oeis.a394;

import irvine.oeis.DifferenceSequence;

/**
 * A394225 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A394225 extends DifferenceSequence {

  /** Construct the sequence. */
  public A394225() {
    super(1, new A394915().prepend(0));
  }
}
