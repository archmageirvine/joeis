package irvine.oeis.a229;

import irvine.oeis.FiniteSequence;

/**
 * A229462 Idoneal numbers (A000926) that are not pentagon exception numbers (A229461).
 * @author Georg Fischer
 */
public class A229462 extends FiniteSequence {

  /** Construct the sequence. */
  public A229462() {
    super(1, FINITE, 7, 15, 28, 60, 112, 240);
  }
}
