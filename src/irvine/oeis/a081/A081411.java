package irvine.oeis.a081;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a001.A001223;

/**
 * A081411 Partial product of prime gaps: a(n) = a(n-1)*(prime(n+1) - prime(n)).
 * @author Sean A. Irvine
 */
public class A081411 extends PartialProductSequence {

  /** Construct the sequence. */
  public A081411() {
    super(1, new A001223());
  }
}

