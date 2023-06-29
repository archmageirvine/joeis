package irvine.oeis.a045;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.PrependSequence;

/**
 * A045829 Catafusenes (see reference for precise definition).
 * @author Sean A. Irvine
 */
public class A045829 extends PrependSequence {

  /** Construct the sequence. */
  public A045829() {
    super(1, new ConvolutionSequence(new A045445()), 0);
  }
}

