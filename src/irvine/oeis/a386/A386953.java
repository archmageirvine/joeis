package irvine.oeis.a386;

import irvine.oeis.PartialSumSequence;

/**
 * A386953 Total number of entries in rows 0,1,...,n of Pascal's triangle not divisible by 9.
 * @author Sean A. Irvine
 */
public class A386953 extends PartialSumSequence {

  /** Construct the sequence. */
  public A386953() {
    super(0, new A386952());
  }
}
