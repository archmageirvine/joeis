package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a005.A005230;

/**
 * A014172.
 * @author Sean A. Irvine
 */
public class A014172 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014172() {
    super(new PartialSumSequence(new A005230()));
  }
}
