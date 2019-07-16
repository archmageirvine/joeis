package irvine.oeis.a023;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a001.A001477;
import irvine.oeis.a014.A014306;

/**
 * A023869.
 * @author Sean A. Irvine
 */
public class A023869 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A023869() {
    super(new A001477(), new A014306());
  }
}
