package irvine.oeis.a023;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002095;

/**
 * A023895 Number of partitions of n into composite parts.
 * @author Sean A. Irvine
 */
public class A023895 extends DifferenceSequence {

  /** Construct the sequence. */
  public A023895() {
    super(new PrependSequence(new A002095(), 0));
  }
}

