package irvine.oeis.a054;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a097.A097945;

/**
 * A054585 Sum_{d=1..n} phi(d)*mu(d).
 * @author Sean A. Irvine
 */
public class A054585 extends PartialSumSequence {

  /** Construct the sequence. */
  public A054585() {
    super(new PrependSequence(new A097945(), 0));
  }
}
