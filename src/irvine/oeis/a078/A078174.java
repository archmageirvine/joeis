package irvine.oeis.a078;

import irvine.oeis.UnionSequence;
import irvine.oeis.a070.A070005;
import irvine.oeis.a246.A246655;

/**
 * A078174 Numbers with an integer arithmetic mean of distinct prime factors.
 * @author Sean A. Irvine
 */
public class A078174 extends UnionSequence {

  /** Construct the sequence. */
  public A078174() {
    super(1, new A246655(), new A070005());
  }
}
