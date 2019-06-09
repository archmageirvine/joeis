package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000204;

/**
 * A023625.
 * @author Sean A. Irvine
 */
public class A023625 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023625() {
    super(new A000204(), new A000040());
  }
}
