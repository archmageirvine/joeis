package irvine.oeis.a074;
// generated by patch_offset.pl at 2023-06-16 18:27

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a217.A217736;

/**
 * A074985 Squares of semiprimes (A001358).
 * @author Sean A. Irvine
 */
public class A074985 extends DifferenceSequence {

  /** Construct the sequence. */
  public A074985() {
    super(1, new PrependSequence(new A217736(), 0));
  }
}
