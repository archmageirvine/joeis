package irvine.oeis.a025;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005408;
import irvine.oeis.a023.A023533;

/**
 * A025115.
 * @author Sean A. Irvine
 */
public class A025115 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A025115() {
    super(new PrependSequence(new A005408(), 0), new A023533(), false);
    next();
  }
}
