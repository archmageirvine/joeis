package irvine.oeis.a050;

import irvine.oeis.closure.DistinctMultiplicativeClosureSequence;
import irvine.oeis.a001.A001566;

/**
 * A050614 Products of distinct terms of A001566: a(n) = Product_{i=0..floor(log_2(n+1))} L(2^(i+1))^bit(n,i).
 * @author Sean A. Irvine
 */
public class A050614 extends DistinctMultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A050614() {
    super(0, new A001566());
  }
}
