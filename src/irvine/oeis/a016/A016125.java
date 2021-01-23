package irvine.oeis.a016;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001021;

/**
 * A016125 Expansion of 1/((1-x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A016125 extends PartialSumSequence {

  /** Construct the sequence. */
  public A016125() {
    super(new A001021());
  }
}

