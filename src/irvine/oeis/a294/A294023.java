package irvine.oeis.a294;
// Generated by ./gen_seq4.pl /partsum0 at 2022-07-13 15:15

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a056.A056172;

/**
 * A294023 Sum of the differences of the larger and smaller parts in the partitions of n into two parts with the smaller part prime.
 * @author Sean A. Irvine
 */
public class A294023 extends PartialSumSequence {

  /** Construct the sequence. */
  public A294023() {
    super(1, new PrependSequence(new A056172(), 0));
  }
}
