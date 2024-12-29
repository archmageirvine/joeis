package irvine.oeis.a073;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;
import irvine.oeis.a066.A066417;

/**
 * A073638.
 * @author Sean A. Irvine
 */
public class A073956 extends FilterSequence {

  private static final A066417 A066417 = new A066417();

  /** Construct the sequence. */
  public A073956() {
    super(1, new A002113().skip(), k -> Predicates.PALINDROME.is(A066417.a(k)));
  }
}
