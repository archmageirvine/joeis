package irvine.oeis.a018;

import irvine.oeis.FiniteSequence;

/**
 * A018897.
 * @author Sean A. Irvine
 */
public class A018897 extends FiniteSequence {

  /** Construct the sequence. */
  public A018897() {
    super(A018188.suckInNumbers("irvine/oeis/a018/a018897.dat.gz"));
  }
}

