package irvine.oeis.a022;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a006.A006520;

/**
 * A022560.
 * @author Sean A. Irvine
 */
public class A022560 extends PartialSumSequence {

  /** Construct the sequence. */
  public A022560() {
    super(new PrependSequence(new A006520(), 0));
  }
}

