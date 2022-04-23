package irvine.oeis.a242;

import irvine.oeis.SemiprimeSequence;
import irvine.oeis.a060.A060352;

/**
 * A242274 Numbers n such that n*3^n - 1 is semiprime.
 * @author Sean A. Irvine
 */
public class A242274 extends SemiprimeSequence {

  /** Construct the sequence. */
  public A242274() {
    super(new A060352(), 1);
  }
}
