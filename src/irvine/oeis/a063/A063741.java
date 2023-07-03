package irvine.oeis.a063;

import irvine.oeis.InverseSequence;
import irvine.oeis.PrependSequence;

/**
 * A063741 Smallest number whose inverse cototient set has n elements.
 * @author Sean A. Irvine
 */
public class A063741 extends InverseSequence {

  /** Construct the sequence. */
  public A063741() {
    super(0, new PrependSequence(new A063740(), 1, -1), 0, 0);
  }
}

