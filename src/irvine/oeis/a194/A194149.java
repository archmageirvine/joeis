package irvine.oeis.a194;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a182.A182772;

/**
 * A194149 Sum_{floor(j*(5-sqrt(3))/2) : 1&lt;=j&lt;=n}; n-th partial sum of Beatty sequence for (5-sqrt(3))/2.
 * @author Sean A. Irvine
 */
public class A194149 extends PartialSumSequence {

  /** Construct the sequence. */
  public A194149() {
    super(1, new A182772());
  }
}
