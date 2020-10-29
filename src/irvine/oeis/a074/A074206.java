package irvine.oeis.a074;

import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002033;

/**
 * A074206 Kalm\u00e1r's [Kalmar's] problem: number of ordered factorizations of n.
 * @author Georg Fischer
 */
public class A074206 extends PrependSequence {

  /**
   * Construct the sequence
   */
  public A074206() {
    super(new A002033(), 0);
  }
}
