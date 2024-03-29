package irvine.oeis.a296;
// Generated by ./gen_seq4.pl /partsum0 at 2022-07-13 15:15

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a070.A070939;

/**
 * A296349 Position where binary expansion of n starts in the binary Champernowne sequence A030190.
 * @author Sean A. Irvine
 */
public class A296349 extends PartialSumSequence {

  /** Construct the sequence. */
  public A296349() {
    super(new PrependSequence(new A070939(), 0));
  }
}
