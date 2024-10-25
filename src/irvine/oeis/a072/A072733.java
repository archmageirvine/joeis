package irvine.oeis.a072;

import irvine.oeis.InverseSequence;

/**
 * A072733 Simple triangle-stretching N X N -&gt; N bijection: Inverse of A072732.
 * @author Sean A. Irvine
 */
public class A072733 extends InverseSequence {

  /** Construct the sequence. */
  public A072733() {
    super(0, new A072732(), 0);
  }
}
