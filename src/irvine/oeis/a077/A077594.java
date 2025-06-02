package irvine.oeis.a077;

import irvine.oeis.Conjectural;
import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A077594 Smallest number whose Reverse and Add! trajectory (presumably) contains exactly n palindromes, or -1 if there is no such number.
 * @author Sean A. Irvine
 */
public class A077594 extends PrependSequence implements Conjectural {

  /** Construct the sequence. */
  public A077594() {
    super(0, new PeriodicSequence(-1), 196, 89, 49, 18, 9, 14, 7, 6, 3, 4, 2, 1, 10000);
  }
}
