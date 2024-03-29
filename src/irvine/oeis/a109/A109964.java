package irvine.oeis.a109;
// Generated by ./gen_seq4.pl /diffseq0 at 2022-06-26 10:36

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002984;

/**
 * A109964 a(n) = floor(sqrt(Sum_{i&lt;n} a(i))), with a(0)=1.
 * @author Sean A. Irvine
 */
public class A109964 extends DifferenceSequence {

  /** Construct the sequence. */
  public A109964() {
    super(new PrependSequence(new A002984(), 0));
  }
}
