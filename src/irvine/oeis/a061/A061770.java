package irvine.oeis.a061;

import irvine.oeis.PrependSequence;
import irvine.oeis.RecordPositionSequence;

/**
 * A061770 Numbers m = a(n) &gt; a(n-1) such that there exists a smallest integer k &gt; 1 such that k!/(k+1)^m is an integer.
 * @author Sean A. Irvine
 */
public class A061770 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A061770() {
    super(new PrependSequence(new A061768(), 0), 0);
  }
}
