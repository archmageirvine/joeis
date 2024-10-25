package irvine.oeis.a072;

import irvine.oeis.InverseSequence;

/**
 * A072735 Simple triangle-stretching N X N -&gt; N bijection: Inverse of A072734, variant of A072733.
 * @author Sean A. Irvine
 */
public class A072735 extends InverseSequence {

  /** Construct the sequence. */
  public A072735() {
    super(0, new A072734(), 0);
  }
}
