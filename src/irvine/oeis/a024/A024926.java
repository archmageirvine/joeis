package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a038.A038605;

/**
 * A024926 a(n) = Sum_{k=1..n} floor(p(k)/k).
 * @author Sean A. Irvine
 */
public class A024926 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024926() {
    super(new A038605());
  }
}
