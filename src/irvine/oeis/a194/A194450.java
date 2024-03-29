package irvine.oeis.a194;
// Generated by ./gen_seq4.pl /partsum0 at 2022-07-13 15:15

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;

/**
 * A194450 Vertex number of a rectangular spiral which contains exactly between its edges the successive shells of the partitions of the positive integers.
 * @author Sean A. Irvine
 */
public class A194450 extends PartialSumSequence {

  /** Construct the sequence. */
  public A194450() {
    super(new PrependSequence(new A194451(), 0));
  }
}
