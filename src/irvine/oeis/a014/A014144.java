package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a003.A003422;

/**
 * A014144 Apply partial sum operator twice to factorials.
 * @author Sean A. Irvine
 */
public class A014144 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014144() {
    super(new A003422());
  }
}
