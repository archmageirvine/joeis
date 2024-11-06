package irvine.oeis.a072;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a051.A051699;

/**
 * A072926 a(n) = Sum_{k=1..n} A051699(k).
 * @author Sean A. Irvine
 */
public class A072926 extends PartialSumSequence {

  /** Construct the sequence. */
  public A072926() {
    super(1, new A051699().skip());
  }
}

