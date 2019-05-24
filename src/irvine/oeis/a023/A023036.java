package irvine.oeis.a023;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001172;

/**
 * A023036 Smallest positive even integer that is an unordered sum of two primes in exactly n ways.
 * @author Sean A. Irvine
 */
public class A023036 extends PrependSequence {

  /** Construct the sequence. */
  public A023036() {
    super(new SkipSequence(new A001172(), 2), 2, 4);
  }
}
