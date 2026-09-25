package irvine.oeis.a394;

import irvine.oeis.gf.EgfSequence;

/**
 * A394515 Number of mixed partitions of an n-element set with at least one unlabeled block and at least one labeled block.
 * @author Sean A. Irvine
 */
public class A394515 extends EgfSequence {

  /** Construct the sequence. */
  public A394515() {
    super(0, "(exp(x)-1)*(exp(exp(x)-1)-1)/(2-exp(x))");
  }
}

