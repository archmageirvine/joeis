package irvine.oeis.a072;

import irvine.oeis.DistinctSequence;
import irvine.oeis.PrependSequence;

/**
 * A072651.
 * @author Sean A. Irvine
 */
public class A072653 extends DistinctSequence {

  /** Construct the sequence. */
  public A072653() {
    super(new PrependSequence(new A072652(), 1));
  }
}
