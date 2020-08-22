package irvine.oeis.a016;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001020;

/**
 * A016123 a(n) = (11^(n+1) - 1)/10.
 * @author Sean A. Irvine
 */
public class A016123 extends PartialSumSequence {

  /** Construct the sequence. */
  public A016123() {
    super(new A001020());
  }
}

