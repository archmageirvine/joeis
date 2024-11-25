package irvine.oeis.a073;

import irvine.oeis.InverseSequence;
import irvine.oeis.a004.A004648;

/**
 * A073325 a(n) = least k &gt; 0 such that prime(k) == n (mod k).
 * @author Sean A. Irvine
 */
public class A073325 extends InverseSequence {

  /** Construct the sequence. */
  public A073325() {
    super(1, new A004648(), 0);
  }
}

