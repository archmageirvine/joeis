package irvine.oeis.a072;

import irvine.oeis.DistinctSequence;
import irvine.oeis.PrependSequence;

/**
 * A072653 Uniqued integer solutions n to n = b^c = c^d.
 * @author Sean A. Irvine
 */
public class A072653 extends DistinctSequence {

  /** Construct the sequence. */
  public A072653() {
    super(new PrependSequence(new A072652(), 1));
  }
}
