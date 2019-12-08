package irvine.oeis.a027;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a001.A001372;
import irvine.oeis.a038.A038002;

/**
 * A027853.
 * @author Sean A. Irvine
 */
public class A027853 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A027853() {
    super(new A038002(), new A001372());
  }
}
