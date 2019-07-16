package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a014.A014306;
import irvine.oeis.a023.A023531;

/**
 * A024327.
 * @author Sean A. Irvine
 */
public class A024327 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024327() {
    super(new A023531(), new A014306());
  }
}
