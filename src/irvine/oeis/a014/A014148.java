package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a007.A007504;

/**
 * A014148 a(n) = Sum_{m=1..n} Sum_{k=1..m} prime(k).
 * @author Sean A. Irvine
 */
public class A014148 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014148() {
    super(1, new A007504().skip(1));
  }
}
