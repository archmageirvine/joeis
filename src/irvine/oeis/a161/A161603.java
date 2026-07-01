package irvine.oeis.a161;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A161603 Odd terms of sequence A161602.
 * @author Sean A. Irvine
 */
public class A161603 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A161603() {
    super(1, 1, 2, k -> Functions.REVERSE.l(2, k) < k);
  }
}
